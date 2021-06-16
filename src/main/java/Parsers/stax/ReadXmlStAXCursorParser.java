package Parsers.stax;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadXmlStAXCursorParser {

    private static final String FILENAME = "E:/Training/MyRepo/resources/tariff.xml";

    public static void main(String[] args) {
        try {

            printXmlByXmlCursorReader(Paths.get(FILENAME));

        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
    }

    private static void printXmlByXmlCursorReader(Path path) throws FileNotFoundException, XMLStreamException {

        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLStreamReader reader = xmlInputFactory.createXMLStreamReader(
                new FileInputStream(path.toFile()));

        int eventType = reader.getEventType();
        System.out.println(eventType);
        System.out.println(reader);

        while (reader.hasNext()) {

            eventType = reader.next();

            if (eventType == XMLEvent.START_ELEMENT) {
                switch (reader.getName().getLocalPart()) {
                    case "tariff" -> {
                        String tariffId = reader.getAttributeValue(null, "id");
                        System.out.printf("Staff id : %s%n", tariffId);
                    }
                    case "name" -> {
                        eventType = reader.next();
                        if (eventType == XMLEvent.CHARACTERS) {
                            System.out.printf("Name : %s%n", reader.getText());
                        }
                    }
                    case "operatorName" -> {
                        eventType = reader.next();
                        if (eventType == XMLEvent.CHARACTERS) {
                            System.out.printf("Operator Name : %s%n", reader.getText());
                        }
                    }
                    case "payRoll" -> {
                        eventType = reader.next();
                        if (eventType == XMLEvent.CHARACTERS) {
                            System.out.printf("Pay Roll : %s%n", reader.getText());
                        }
                    }
                    case "callPrices" -> {
                        String callPricesId = reader.getAttributeValue(null, "id");
                        System.out.printf("Call Price id : %s%n", callPricesId);
                    }
                    case "insideNetwork" -> {
                        eventType = reader.next();
                        if (eventType == XMLEvent.CHARACTERS) {
                            System.out.printf("Inside Network : %s%n", reader.getText());
                        }
                    }
                    case "outsideNetwork" -> {
                        eventType = reader.next();
                        if (eventType == XMLEvent.CHARACTERS) {
                            System.out.printf("Outside Network : %s%n", reader.getText());
                        }
                    }
                    case "fixedNumbers" -> {
                        eventType = reader.next();
                        if (eventType == XMLEvent.CHARACTERS) {
                            System.out.printf("Fixed Number : %s%n", reader.getText());
                        }
                    }
                    case "smsPrice" -> {
                        eventType = reader.next();
                        if (eventType == XMLEvent.CHARACTERS) {
                            System.out.printf("Sms Price : %s%n", reader.getText());
                        }
                    }
                    case "parameters " -> {
                        String parametersId = reader.getAttributeValue(null, "id");
                        System.out.printf("Parameter id : %s%n", parametersId);
                    }
                    case "favotiteNumber" -> {
                        eventType = reader.next();
                        if (eventType == XMLEvent.CHARACTERS) {
                            System.out.printf("Favorite Number : %s%n", reader.getText());
                        }
                    }
                    case "tariffication" -> {
                        eventType = reader.next();
                        if (eventType == XMLEvent.CHARACTERS) {
                            System.out.printf("Tariffication : %s%n", reader.getText());
                        }
                    }
                    case "connectionFee" -> {
                        eventType = reader.next();
                        if (eventType == XMLEvent.CHARACTERS) {
                            System.out.printf("Connection Fee : %s%n", reader.getText());
                        }
                    }
                }
            }

            if (eventType == XMLEvent.END_ELEMENT) {
                if (reader.getName().getLocalPart().equals("tariff")) {
                    System.out.printf("%n%s%n%n", "---");
                }
            }
        }
    }
}
