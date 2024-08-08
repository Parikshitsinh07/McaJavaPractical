=import java.sql.*;
//import java.util.Scanner;

class StudentInfo {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null; 

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/parikshit_20", "root", "");

            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM student_info");
				System.out.println("Roll.No\t\tName\t\t Date of Birth\t\tContact No");

            while (rs.next()) {
                /*System.out.println();
				System.out.println("Student Roll.No :" + rs.getInt(1));
				System.out.println("Student Name : " + rs.getString(2));
				System.out.println("Student Date of Birth : "+ rs.getString(3));
				System.out.println("Student Contact No : "+ rs.getString(4));
				System.out.println();
				
				/*System.out.println("Student Roll.No :" + rs.getInt("std_id"));
				System.out.println("Student Name : " + rs.getString("std_name"));
				System.out.println("Student Date of Birth : "+ rs.getString("std_dob"));
				System.out.println("Student Contact No : "+ rs.getString("std_cno"));*/
				
			//tebele Form print	
				System.out.println(rs.getInt("std_id")+"\t\t"+rs.getString("std_name")+"\t\t"+rs.getString("std_dob")+"\t\t"+rs.getString("std_cno"));

            }
			
			
			
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Class Not Found : " + cnfe.getMessage());
        } catch (SQLException se) {
            System.out.println("SQL Exception : " + se.getMessage());
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println("SQL Exception : " + e.getMessage());
            }
        }
    }
}
