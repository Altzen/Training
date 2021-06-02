package Parsers.jaxb;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import xmlToObjectToDbViceVersa.Tariffs;

import java.io.File;

public class TariffXmlToObject {
    public static void main(String[] args) {

        JAXBContext jaxbContext;
        try {

            jaxbContext = JAXBContext.newInstance(Tariffs.class);


            File file = new File("E:/Training/MyRepo/resources/tariffTest.xml");

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            Tariffs o = (Tariffs) jaxbUnmarshaller.unmarshal(file);

            System.out.println(o);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
