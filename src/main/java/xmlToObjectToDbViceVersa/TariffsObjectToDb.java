package xmlToObjectToDbViceVersa;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.List;

public class TariffsObjectToDb {

    public static void insertTariffsObjectToDb(Connection connection, Tariffs tariffs) throws SQLException {


        Statement statement = connection.createStatement();

        if (tariffs != null) {
            List<Tariff> tariffList = tariffs.getTariff();
            try {
                for (Tariff tariff : tariffList) {
                    CallPrices callPrices = tariff.getCallPrices();

                    int callPriceId = callPrices.getId();
                    int insideNetwork = callPrices.getInsideNetwork();
                    int outsideNetwork = callPrices.getOutsideNetwork();
                    int fixedNumbers = callPrices.getFixedNumbers();

                    statement.execute("INSERT INTO callprices (id, insideNetwork, outsideNetwork, fixedNumbers) VALUES ('" + callPriceId + "', '" + insideNetwork + "', '" + outsideNetwork + "', '" + fixedNumbers + "');");
                }
            } catch (SQLIntegrityConstraintViolationException e) { //Throws SQLIntegrityConstraintViolationException if catches same Primary Key TODO
                System.out.println("Current Primary Key is already exist - Item wasn't added" + e.getMessage());
            }
            try {
                for (Tariff tariff : tariffList) {
                    Parameters parameters = tariff.getParameters();

                    int parameterId = parameters.getId();
                    int favotiteNumber = parameters.getFavotiteNumber();
                    int tariffication = parameters.getTariffication();
                    int connectionFee = parameters.getConnectionFee();

                    statement.execute("INSERT INTO parameters (id, favotiteNumber, tariffication, connectionFee) VALUES ('" + parameterId + "', '" + favotiteNumber + "', '" + tariffication + "', '" + connectionFee + "');");
                }
            } catch (SQLIntegrityConstraintViolationException e) { //Throws SQLIntegrityConstraintViolationException if catches same Primary Key TODO
                System.out.println("Current Primary Key is already exist - Item wasn't added" + e.getMessage());
            }
            try {
                for (Tariff tariff : tariffList) {
                    CallPrices callPrices = tariff.getCallPrices();
                    Parameters parameters = tariff.getParameters();

                    int tariffId = tariff.getId();
                    String name = tariff.getName();
                    String operatorName = tariff.getOperatorName();
                    int payRoll = tariff.getPayRoll();
                    int callPriceId = callPrices.getId();

                    int smsPrice = tariff.getSmsPrice();
                    int parameterId = parameters.getId();

                    statement.execute("INSERT INTO tariffs (id, name, operatorName, payRoll, callPriceId, smsPrice, parameterId) VALUES ('" + tariffId + "', '" + name + "', '" + operatorName + "', '" + payRoll + "', '" + callPriceId + "', '" + smsPrice + "', '" + parameterId + "');");
                }
            } catch (SQLIntegrityConstraintViolationException e) { //Throws SQLIntegrityConstraintViolationException if catches same Primary Key TODO
                System.out.println("Current Primary Key is already exist - Item wasn't added " + e.getMessage());
            }
        }

    }


}
