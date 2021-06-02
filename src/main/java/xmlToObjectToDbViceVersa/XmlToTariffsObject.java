package xmlToObjectToDbViceVersa;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class XmlToTariffsObject {

    public static Tariffs createTariffsObjectFromXml(File file) {


        JAXBContext jaxbContext;

        Tariffs tariffs = new Tariffs();
        try {

            jaxbContext = JAXBContext.newInstance(Tariffs.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            tariffs = (Tariffs) jaxbUnmarshaller.unmarshal(file);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return tariffs;

    }

}
