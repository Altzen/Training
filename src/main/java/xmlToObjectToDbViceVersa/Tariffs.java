package xmlToObjectToDbViceVersa;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement

@XmlAccessorType(XmlAccessType.FIELD)
public class Tariffs {

    @Override
    public String toString() {
        return "Tariffs{" +
                "tariff=" + tariff +
                '}';
    }

    @XmlElement
    List<Tariff> tariff = new ArrayList<>();


    public List<Tariff> getTariff() {
        return tariff;
    }

    public void setTariff(List<Tariff> tariffs) {
        this.tariff = tariffs;
    }
}
