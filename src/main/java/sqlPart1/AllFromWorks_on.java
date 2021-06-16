package sqlPart1;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AllFromWorks_on {
    public void selectAllFromWorks_on(Statement statement) {
        try {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM works_on");
            while (resultSet.next()) {
                int emp_no = resultSet.getInt("emp_no");
                int project_no = resultSet.getInt("project_no");
                String job = resultSet.getString("job");
                Date date = resultSet.getDate("enter_date");

                System.out.println(emp_no + " / " + project_no + " / " + job + " / " + date);

            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
