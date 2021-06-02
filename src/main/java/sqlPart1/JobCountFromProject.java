package sqlPart1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JobCountFromProject {
    public static void selectJobCountFromProject(Connection connection) {
        try {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT COUNT(DISTINCT job), project_no FROM works_on GROUP BY project_no ORDER BY project_no");
            while (resultSet.next()) {
                int count = resultSet.getInt(1);
                int project_no = resultSet.getInt("project_no");

                System.out.println(project_no + " | " + count);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("-------------------------------");
    }
}
