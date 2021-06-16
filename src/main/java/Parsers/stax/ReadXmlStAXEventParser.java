package Parsers.stax;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadXmlStAXEventParser {
    private static final String FILENAME = "E:/Training/MyRepo/resources/tariff.xml";

    public static void main(String[] args) {

        try {

            printXmlByXmlEventReader(Paths.get(FILENAME));

        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }

    }

    private static void printXmlByXmlEventReader(Path path)
            throws FileNotFoundException, XMLStreamException {

        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLEventReader reader = xmlInputFactory.createXMLEventReader(
                new FileInputStream(path.toFile()));

        while (reader.hasNext()) {

            XMLEvent event = reader.nextEvent();

            if (event.isStartElement()) {

                StartElement element = event.asStartElement();

                switch (element.getName().getLocalPart()) {
                    case "tariff" -> {
                        Attribute tariffId = element.getAttributeByName(new QName("id"));
                        System.out.printf("Tariff id : %s%n", tariffId.getValue());
                    }
                    case "name" -> {
                        event = reader.nextEvent();
                        if (event.isCharacters()) {
                            System.out.printf("Name : %s%n", event.asCharacters().getData());
                        }
                    }
                    case "operatorName" -> {
                        event = reader.nextEvent();
                        if (event.isCharacters()) {
                            System.out.printf("Operator Name : %s%n", event.asCharacters().getData());
                        }
                    }
                    case "payRoll" -> {
                        event = reader.nextEvent();
                        if (event.isCharacters()) {
                            System.out.printf("Pay Roll : %s%n", event.asCharacters().getData());
                        }
                    }
                    case "callPrices" -> {
                        Attribute callPricesId = element.getAttributeByName(new QName("id"));
                        System.out.printf("Call Price id : %s%n", callPricesId.getValue());
                    }
                    case "insideNetwork" -> {
                        event = reader.nextEvent();
                        if (event.isCharacters()) {
                            System.out.printf("Inside Network : %s%n", event.asCharacters().getData());
                        }
                    }
                    case "outsideNetwork" -> {
                        event = reader.nextEvent();
                        if (event.isCharacters()) {
                            System.out.printf("Outside Network : %s%n", event.asCharacters().getData());
                        }
                    }
                    case "fixedNumbers" -> {
                        event = reader.nextEvent();
                        if (event.isCharacters()) {
                            System.out.printf("Fixed Number : %s%n", event.asCharacters().getData());
                        }
                    }
                    case "smsPrice" -> {
                        event = reader.nextEvent();
                        if (event.isCharacters()) {
                            System.out.printf("Sms Price : %s%n", event.asCharacters().getData());
                        }
                    }
                    case "parameters" -> {
                        Attribute parametersId = element.getAttributeByName(new QName("id"));
                        System.out.printf("Parameter id : %s%n", parametersId.getValue());
                    }
                    case "favotiteNumber" -> {
                        event = reader.nextEvent();
                        if (event.isCharacters()) {
                            System.out.printf("Favorite Number : %s%n", event.asCharacters().getData());
                        }
                    }
                    case "tariffication" -> {
                        event = reader.nextEvent();
                        if (event.isCharacters()) {
                            System.out.printf("Tariffication : %s%n", event.asCharacters().getData());
                        }
                    }
                    case "connectionFee" -> {
                        event = reader.nextEvent();
                        if (event.isCharacters()) {
                            System.out.printf("Connection Fee : %s%n", event.asCharacters().getData());
                        }
                    }
                }
            }

            if (event.isEndElement()) {
                EndElement endElement = event.asEndElement();

                if (endElement.getName().getLocalPart().equals("tariff")) {
                    System.out.printf("%n%s%n%n", "---");
                }
            }

        }

    }
}
