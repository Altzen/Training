package sqlPart1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsersWithSecondAFromEmployee {
    public static void selectFullInfoFromDepartment(Connection connection) {
        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM employee WHERE emp_Fname LIKE '_a%'");
            while (resultSet.next()) {
                int emp_no = resultSet.getInt("emp_no");
                String emp_Fname = resultSet.getString("emp_Fname");
                String emp_Lname = resultSet.getString("emp_Lname");

                System.out.println(emp_no + " | " + emp_Fname + " | " + emp_Lname);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("-------------------------------");
    }
}
