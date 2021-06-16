package sqlPart1;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
//        Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "1111");
            int projectID = 1;

            // SELECT TASKS
            AllDataFromDepartment.selectFullInfoFromDepartment(connection); // Shows all data from departments
            DallasNamesAndNumbers.selectDallasNamesAndNumbers(connection); // Shows all data with Dallas from departments
            UsersWithSecondAFromEmployee.selectFullInfoFromDepartment(connection); // Shows all users with second a from employee
            EmpNoAndJobsByProjectNo.selectEmpNoAndJobsByProjectNo(connection,projectID); // Shows all jobs with UserID by ProjectNumber
            JobCountFromProject.selectJobCountFromProject(connection); // Shows counts per project


            // JOIN TASKS
            UsersNumberFromSeattle.selectUsersNumberFromSeattle(connection);

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}