package xmlToObjectToDbViceVersa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbToTariffsObject {

    public static Tariffs createTariffsObject (Connection connection) {

        Tariffs tariffs = new Tariffs();
        List<Tariff> tariffList = new ArrayList<>();
        try {

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM tariffs JOIN callprices ON tariffs.callPriceId=callprices.id JOIN parameters ON tariffs.parameterId=parameters.id;");
            while (resultSet.next()) {
                Tariff tariff = new Tariff(
                        resultSet.getInt(1),
                        resultSet.getString("name"),
                        resultSet.getString("operatorName"),
                        resultSet.getInt("payRoll"),
                        new CallPrices(
                                resultSet.getInt(5),
                                resultSet.getInt("insideNetwork"),
                                resultSet.getInt("outsideNetwork"),
                                resultSet.getInt("fixedNumbers")),
                        resultSet.getInt("smsPrice"),
                        new Parameters(
                                resultSet.getInt(7),
                                resultSet.getInt("favotiteNumber"),
                                resultSet.getInt("tariffication"),
                                resultSet.getInt("connectionFee"))
                );

                tariffList.add(tariff);

            }



        }catch (SQLException e) {
            e.printStackTrace();
        }

        tariffs.setTariff(tariffList);



        return tariffs;
    }
}
