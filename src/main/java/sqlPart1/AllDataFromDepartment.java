package sqlPart1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AllDataFromDepartment {
    public static void selectFullInfoFromDepartment(Connection connection) {
        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM department");
            while (resultSet.next()) {
                int dept_no = resultSet.getInt("dept_no");
                String dept_name = resultSet.getString("dept_name");
                String location = resultSet.getString("location");

                System.out.println(dept_no + " | " + dept_name + " | " + location);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("-------------------------------");

    }
}
