package xmlToObjectToDbViceVersa;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;

public class TariffsObjectToXml {

    public static void tariffsObjectToXml (Tariffs tariffsList) {

        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(Tariffs.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(tariffsList, new File("E:/Training/MyRepo/resources/tariffTest.xml"));
        }catch (JAXBException e){
            e.printStackTrace();
        }
    }
}
