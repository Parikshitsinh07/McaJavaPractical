import java.sql.*;
import java.lang.Object;
class jdbcDemo{
	public static void main(String [] arg){
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
			try{
				Class c = Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","");
				st = con.CreateStatement();
				rs = st.executeQueries("Select");
				while(rs.next()){
					System.out.println(""+rs.getString(1));
				}
				st.close();
				con.close();
			}
			catch(ClassNotFoundException ce){
				System.out.println("Hello");
			}
			catch(Exception e){
				e.printStackTrace();
			}
 	}
}