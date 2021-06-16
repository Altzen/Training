package sqlPart1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpNoAndJobsByProjectNo {
    public static void selectEmpNoAndJobsByProjectNo(Connection connection,int project_no) {
        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM works_on WHERE project_no='" + project_no + "'");
            while (resultSet.next()) {
                int emp_no = resultSet.getInt("emp_no");
                String job = resultSet.getString("job");

                System.out.println(emp_no + " | " + job);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("-------------------------------");
    }
}
