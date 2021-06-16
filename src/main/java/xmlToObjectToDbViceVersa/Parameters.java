package xmlToObjectToDbViceVersa;

import jakarta.xml.bind.annotation.*;

@XmlRootElement

@XmlAccessorType(XmlAccessType.FIELD)
public class Parameters {

    @XmlAttribute
    int id;

    @XmlElement
    int favotiteNumber;
    int tariffication;
    int connectionFee;

    public Parameters(int id, int favotiteNumber, int tariffication, int connectionFee) {
        this.id = id;
        this.favotiteNumber = favotiteNumber;
        this.tariffication = tariffication;
        this.connectionFee = connectionFee;
    }

    public Parameters (){}

    @Override
    public String toString() {
        return "Parameters{" +
                "id=" + id +
                ", favotiteNumber=" + favotiteNumber +
                ", tariffication=" + tariffication +
                ", connectionFee=" + connectionFee +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFavotiteNumber() {
        return favotiteNumber;
    }

    public void setFavotiteNumber(int favotiteNumber) {
        this.favotiteNumber = favotiteNumber;
    }

    public int getTariffication() {
        return tariffication;
    }

    public void setTariffication(int tariffication) {
        this.tariffication = tariffication;
    }

    public int getConnectionFee() {
        return connectionFee;
    }

    public void setConnectionFee(int connectionFee) {
        this.connectionFee = connectionFee;
    }
}
