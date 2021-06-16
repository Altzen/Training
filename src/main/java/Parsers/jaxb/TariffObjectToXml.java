package Parsers.jaxb;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import xmlToObjectToDbViceVersa.CallPrices;
import xmlToObjectToDbViceVersa.Parameters;
import xmlToObjectToDbViceVersa.Tariff;
import xmlToObjectToDbViceVersa.Tariffs;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class TariffObjectToXml {

    public static void main(String[] args) {

        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(Tariffs.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            Tariffs tariffs = new Tariffs();
            List <Tariff> tariffList = new ArrayList<>();

            Tariff t = new Tariff(1,"Arno", "Life", 14, new CallPrices(1,16,17,14),14,new Parameters(1,22,23,24));
            Tariff a = new Tariff(2,"Dante", "God", 34, new CallPrices(2,36,37,34),24,new Parameters(2,42,43,44));

            tariffList.add(t);
            tariffList.add(a);

            tariffs.setTariff(tariffList);
            jaxbMarshaller.marshal(tariffs, new File("E:/Training/MyRepo/resources/tariffTest.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
