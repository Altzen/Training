package Parsers.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ReadXmlDomParser {
    private static final String FILENAME = "E:/Training/MyRepo/resources/tariff.xml";

    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {

            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File(FILENAME));

            doc.getDocumentElement().normalize();

            System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
            System.out.println("------");


            NodeList tariffList = doc.getElementsByTagName("tariff");

            for (int temp = 0; temp < tariffList.getLength(); temp++) {
                Node node = tariffList.item(temp);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    String id = element.getAttribute("id");

                    String name = element.getElementsByTagName("name").item(0).getTextContent();
                    String operatorName = element.getElementsByTagName("operatorName").item(0).getTextContent();
                    String payRoll = element.getElementsByTagName("payRoll").item(0).getTextContent();

                    String callPrices = doc.getElementsByTagName("callPrices").item(0).getNodeName();
                    String callPriceId = element.getAttribute("id");
                    String insideNetwork = element.getElementsByTagName("insideNetwork").item(0).getTextContent();
                    String outsideNetwork = element.getElementsByTagName("outsideNetwork").item(0).getTextContent();
                    String fixedNumbers = element.getElementsByTagName("fixedNumbers").item(0).getTextContent();


                    String smsPrice = element.getElementsByTagName("smsPrice").item(0).getTextContent();

                    String parameters = doc.getElementsByTagName("parameters").item(0).getNodeName();
                    String parametersId = element.getAttribute("id");
                    String favotiteNumber = element.getElementsByTagName("favotiteNumber").item(0).getTextContent();
                    String tariffication = element.getElementsByTagName("tariffication").item(0).getTextContent();
                    String connectionFee = element.getElementsByTagName("connectionFee").item(0).getTextContent();


                    System.out.println("<" + node.getNodeName() + " " + "id=" + '"' + id + '"' + ">");
                    System.out.println("    <name>" + name + "</name>");
                    System.out.println("    <operatorName>" + operatorName + "</operatorName>");
                    System.out.println("    <payRoll>" + payRoll + "</payRoll>");

                    System.out.println("    <" + callPrices + " " + "id=" + '"' + callPriceId + '"' + ">");
                    System.out.println("        <insideNetwork>" + insideNetwork + "</insideNetwork>");
                    System.out.println("        <outsideNetwork>" + outsideNetwork + "</outsideNetwork>");
                    System.out.println("        <fixedNumbers>" + fixedNumbers + "</fixedNumbers>");
                    System.out.println("    </" + callPrices + ">");

                    System.out.println("    <smsPrice>" + smsPrice + "</smsPrice>");

                    System.out.println("    <" + parameters + " " + "id=" + '"' + parametersId + '"' + ">");

                    System.out.println("        <favotiteNumber>" + favotiteNumber + "</favotiteNumber>");
                    System.out.println("        <tariffication>" + tariffication + "</tariffication>");
                    System.out.println("        <connectionFee>" + connectionFee + "</connectionFee>");
                    System.out.println("    </" + parameters + ">");

                    System.out.println("</" + node.getNodeName() + ">");

                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
