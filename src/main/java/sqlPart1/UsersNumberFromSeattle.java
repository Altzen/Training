package sqlPart1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsersNumberFromSeattle {
    public static void selectUsersNumberFromSeattle(Connection connection) {
        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT employee.emp_no, employee.emp_Fname, employee.emp_Lname FROM employee JOIN department dept ON dept.dept_no=employee.dept_no WHERE dept.`location`='Seattle'");
            while (resultSet.next()) {
                int emp_no = resultSet.getInt(1);
                String First = resultSet.getString(2);
                String Last = resultSet.getString(3);

                System.out.println(emp_no + " | " + First + " " + Last);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("-------------------------------");
    }
}
