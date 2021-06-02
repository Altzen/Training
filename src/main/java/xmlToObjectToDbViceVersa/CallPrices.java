package xmlToObjectToDbViceVersa;

import jakarta.xml.bind.annotation.*;

@XmlRootElement

@XmlAccessorType(XmlAccessType.FIELD)
public class CallPrices {
    @XmlAttribute
    int id;

    @XmlElement
    int insideNetwork;
    int outsideNetwork;
    int fixedNumbers;

    public CallPrices(int id, int insideNetwork, int outsideNetwork, int fixedNumbers) {
        this.id = id;
        this.insideNetwork = insideNetwork;
        this.outsideNetwork = outsideNetwork;
        this.fixedNumbers = fixedNumbers;
    }

    public CallPrices() {
    }

    @Override
    public String toString() {
        return "CallPrices{" +
                "id=" + id +
                ", insideNetwork=" + insideNetwork +
                ", outsideNetwork=" + outsideNetwork +
                ", fixedNumbers=" + fixedNumbers +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInsideNetwork() {
        return insideNetwork;
    }

    public void setInsideNetwork(int insideNetwork) {
        this.insideNetwork = insideNetwork;
    }

    public int getOutsideNetwork() {
        return outsideNetwork;
    }

    public void setOutsideNetwork(int outsideNetwork) {
        this.outsideNetwork = outsideNetwork;
    }

    public int getFixedNumbers() {
        return fixedNumbers;
    }

    public void setFixedNumbers(int fixedNumbers) {
        this.fixedNumbers = fixedNumbers;
    }
}
