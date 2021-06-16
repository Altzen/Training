package sqlPart2;

import java.sql.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "1111");
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            Statement statement = connection.createStatement();

            ResultSet resultMetaDataSet = databaseMetaData.getTables(null, null, null, new String[]{"TABLE"});
            System.out.println("DATA BASE META DATA");
            while(resultMetaDataSet.next()) {
                String systemTableName = resultMetaDataSet.getString("TABLE_NAME");
                System.out.println(systemTableName);
                System.out.println("- - - - - - - - -");
            }
            System.out.println("-X-X-X-X-X-X-X-X-");

            ResultSet resultEmployeeSet = statement.executeQuery("SELECT * FROM employee");
            System.out.println("EMPLOYEE TABLE");
            while(resultEmployeeSet.next()){
                int emp_no = resultEmployeeSet.getInt("emp_no");
                String emp_Fname = resultEmployeeSet.getString("emp_Fname");
                String emp_Lname = resultEmployeeSet.getString("emp_Lname");
                int dept_no = resultEmployeeSet.getInt("dept_no");

                System.out.println("|" + emp_no + "|" + emp_Fname + "|" + emp_Lname + "|" + dept_no);
                System.out.println("- - - - - - - - -");
            }
            System.out.println("-X-X-X-X-X-X-X-X-");

            ResultSet resultDepartmentSet = statement.executeQuery("SELECT * FROM department");
            System.out.println("DEPARTMENT TABLE");
            while(resultDepartmentSet.next()){
                int dept_no = resultDepartmentSet.getInt(1);
                String dept_name = resultDepartmentSet.getString(2);
                String location = resultDepartmentSet.getString(3);

                System.out.println("|" + dept_no + "|" + dept_name + "|" + location + "|");
                System.out.println("- - - - - - - - -");
            }
            System.out.println("-X-X-X-X-X-X-X-X-");

            ResultSet resultProjectSet = statement.executeQuery("SELECT * FROM project");
            System.out.println("PROJECT TABLE");
            while(resultProjectSet.next()){
                int project_no = resultProjectSet.getInt(1);
                String project_name = resultProjectSet.getString(2);
                int budget = resultProjectSet.getInt(3);

                System.out.println("|" + project_no + "|" + project_name + "|" + budget + "|");
                System.out.println("- - - - - - - - -");
            }
            System.out.println("-X-X-X-X-X-X-X-X-");

            ResultSet resultWorksOnSet = statement.executeQuery("SELECT * FROM works_on");
            System.out.println("WORKS ON TABLE");
            while(resultWorksOnSet.next()){
                int emp_no = resultWorksOnSet.getInt(1);
                int project_no = resultWorksOnSet.getInt(2);
                String job = resultWorksOnSet.getString(3);
                Date enter_date = resultWorksOnSet.getDate(4);

                System.out.println("|" + emp_no + "|" + project_no + "|" + job + "|" + enter_date + "|");
                System.out.println("- - - - - - - - -");
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
