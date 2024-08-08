import java.sql.*;
import java.util.*;

class DbmsProject{
	public static void main(String [] arg){
	
		Connection con = null;
		Statement st = null;
		//ResultSet rs = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/parikshit_20","root","");
			st = con.createStatement();
			System.out.println("Hello");
			
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Employee No : ");
            int Employee_Id = sc.nextInt();
            System.out.print("Enter Employee Name : ");
            String Employee_Name = sc.next();
		
            System.out.print("Enter Employee Date of Birth (yyyy/mm/dd) : ");
            String Employee_Bod = sc.next();
            System.out.print("Enter Employee JOB : ");
            String Employee_Job = sc.next();
            System.out.print("Enter Employee Contact No : ");
            String Employee_MobliNumber = sc.next();
			//aapre table ma update j karie ne so executeUpdate use thay : insert, delete and update mate
			//select mare executeQuery no use thay because query ne show karvani matlab execute
			
			int c = st.executeUpdate("INSERT INTO `employee` (`Empno`, `Ename`, `Bob`, `Job`, `Contactno`) VALUES ("+Employee_Id+", '"+Employee_Name+"', '"+Employee_Bod+"', '"+Employee_Job+"', '"+Employee_MobliNumber+"')");
			
			if(c<=0){
				System.out.println("Failed");
			}else{
				System.out.println("Successful");
			}
		}
		catch(ClassNotFoundException cf){
			System.out.println("Class Not Found Driver can't Find Class");
		}
		catch(SQLException cs){
			System.out.println("Connection Not Stablis"+cs.getMessage());
		}
		catch(Exception es){
			System.out.println("Exception : " + es.getMessage() );
			
		}
		finally{
			try{
				if(con != null){
					con.close();		
				}
				if(st != null){
					st.close();
				}
			}
			catch(SQLException cs){
				System.out.println("Connection Not Stablis"+cs.getMessage());
			}
		}
	}

}