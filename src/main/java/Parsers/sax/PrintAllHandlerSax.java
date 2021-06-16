package Parsers.sax;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class PrintAllHandlerSax extends DefaultHandler {

    private StringBuilder currentValue = new StringBuilder();

    @Override
    public void startElement(
            String uri,
            String localName,
            String qName,
            Attributes attributes) {

        currentValue.setLength(0);

        System.out.printf("Start Element : %s%n", qName);

        if (qName.equalsIgnoreCase("tariff")) {
            String id = attributes.getValue(0);
            System.out.printf("Tariff id : %s%n", id);
        }
        if (qName.equalsIgnoreCase("callPrices")) {
            String id = attributes.getValue(0);
            System.out.printf("Call Price id : %s%n", id);
        }
        if (qName.equalsIgnoreCase("parameters")) {
            String id = attributes.getValue(0);
            System.out.printf("Parameter id : %s%n", id);

        }
    }

    @Override
    public void endElement(String uri,
                           String localName,
                           String qName) {

        System.out.printf("End Element : %s%n", qName);

        if (qName.equalsIgnoreCase("name")) {
            System.out.printf("Name : %s%n", currentValue.toString());
        }
        if (qName.equalsIgnoreCase("operatorName")) {
            System.out.printf("Operator Name : %s%n", currentValue.toString());
        }
        if (qName.equalsIgnoreCase("payRoll")) {
            System.out.printf("Pay Roll : %s%n", currentValue.toString());
        }
        if (qName.equalsIgnoreCase("insideNetwork")) {
            System.out.printf("Inside Network : %s%n", currentValue.toString());
        }
        if (qName.equalsIgnoreCase("outsideNetwork")) {
            System.out.printf("Outside Network : %s%n", currentValue.toString());
        }
        if (qName.equalsIgnoreCase("fixedNumbers")) {
            System.out.printf("Fixed Numbers : %s%n", currentValue.toString());
        }
        if (qName.equalsIgnoreCase("smsPrice")) {
            System.out.printf("Sms Price : %s%n", currentValue.toString());
        }
        if (qName.equalsIgnoreCase("favotiteNumber")) {
            System.out.printf("Favorite Number : %s%n", currentValue.toString());
        }
        if (qName.equalsIgnoreCase("tariffication")) {
            System.out.printf("Tariffication : %s%n", currentValue.toString());
        }
        if (qName.equalsIgnoreCase("connectionFee")) {
            System.out.printf("Connection Fee : %s%n", currentValue.toString());
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        currentValue.append(ch, start, length);
    }
}
