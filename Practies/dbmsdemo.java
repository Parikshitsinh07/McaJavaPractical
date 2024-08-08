import java.lang.*;// Object Class
import java.util.*;//Input Out Manege
import java.sql.*;//Database mate

class dbmsdemo{
	public static void main(String arg[]){
		Connection con = null ;//Connection Interfaces no reference lidho 6
		Statement st = null;  // Statement Interfaces no reference lidho 6
		try{
			Class.forName("com.mysql.jdbc.Driver");//Load The Driver
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","");
			st = con.createStatement();
			System.out.println("Hello");
			con.close();
			st.close();
			}
		catch(ClassNotFoundException cf){
			System.out.println("Class Not Found Driver can't Find Class");
		}
		catch(SQLException cs){
			System.out.println("Connection Not Stablis");
		}
	    
	}
}