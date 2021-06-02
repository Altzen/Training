package xmlToObjectToDbViceVersa;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "1111"); // Creating connection with DB

            File file1 = new File("E:/Training/MyRepo/resources/tariff.xml"); // Path to xml File

            TariffsObjectToDb.insertTariffsObjectToDb(connection, XmlToTariffsObject.createTariffsObjectFromXml(file1));
            // XmlToTariffsObject.createTariffsObjectFromXml - this method create Object from xml File
            // TariffsObjectToDb.insertTariffsObjectToDb - this method make INSERT into DB

            TariffsObjectToXml.tariffsObjectToXml(DbToTariffsObject.createTariffsObject(connection));
            // DbToTariffsObject.createTariffsObject - this method create Object from DB data
            // TariffsObjectToXml.tariffsObjectToXml - this method create xml File from created Object

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
