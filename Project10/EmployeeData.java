import java.sql.*;
import java.util.Scanner;

class EmployeeData {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;

        try {
			//fetch driver class of jdbc
            Class.forName("com.mysql.jdbc.Driver");		
			//connect database 
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/parikshit_20", "root", "");		

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Employee No : ");
            int emp_no = sc.nextInt();
            System.out.println("Enter Employee Name : ");
            String emp_name = sc.next();
            System.out.println("Enter Employee Date of Birth (yyyy/mm/dd) : ");
            String emp_dob = sc.next();
            System.out.println("Enter Employee JOB : ");
            String emp_job = sc.next();
            System.out.println("Enter Employee Contact No : ");
            String emp_cno = sc.next();

            st = con.createStatement();
            int c = st.executeUpdate("INSERT INTO employee (Empno, Ename, Bob, Job, Contactno) " + "VALUES (" + emp_no + ", '" + emp_name + "', '" + emp_dob + "', '" + emp_job + "', '" + emp_cno + "')");

            if (c <= 0) {
                System.out.println("Insertion Failed");
            } else {
                System.out.println("Insertion successfully");
            }
			
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Class Not Found : " + cnfe.getMessage());
        } catch (SQLException se) {
            System.out.println("SQL Exception : " + se.getMessage());
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        } finally {
            try {
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
