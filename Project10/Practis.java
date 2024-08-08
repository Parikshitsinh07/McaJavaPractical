import java.sql.*;
import java.util.Scanner;
class Practis
{
	public static void main(String [] a)
	{
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Parikshit_20","root","");
			//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/parikshit_20", "root", "");
			st = con.createStatement();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Select oparetion on database");
			System.out.println("1.Insert");
			System.out.println("2.Show data");
			int op = sc.nextInt();
			if(op == 1)
			{
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
			
				int s = st.executeUpdate("INSERT INTO `employee` (`Empno`, `Ename`, `Bob`, `Job`, `Contactno`) VALUES ("+Employee_Id+", '"+Employee_Name+"', '"+Employee_Bod+"', '"+Employee_Job+"', '"+Employee_MobliNumber+"')");
				if(s<=0){
					System.out.println("Failed");
				}else{
					System.out.println("Successful");
				}
			}
			else
			{
				rs = st.executeQuery("SELECT * FROM `employee`");
				while(rs.next())
				{
					System.out.println("employee No :" + rs.getInt(1));
				System.out.println("employee Name : " + rs.getString(2));
				System.out.println("employee Date of Birth : "+ rs.getString(3));
				System.out.println("employee Job No : "+ rs.getString(4));
				System.out.println("employee Contactno : "+ rs.getString(5));
				System.out.println();
				}
			}
				
		}
		catch(ClassNotFoundException cl)
		{
			cl.printStackTrace();
		}
		catch(SQLException Se)
		{
			Se.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(con!=null){	
					con.close();
				}
				if(con!=null){
					st.close();
				}
				if(con!=null){
					rs.close();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}