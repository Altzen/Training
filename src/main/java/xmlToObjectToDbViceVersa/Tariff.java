package xmlToObjectToDbViceVersa;

import jakarta.xml.bind.annotation.*;

@XmlRootElement

@XmlAccessorType(XmlAccessType.FIELD)
public class Tariff {

    @XmlAttribute
    int id;

    @XmlElement
    String name;
    String operatorName;
    int payRoll;
    CallPrices callPrices;
    int smsPrice;
    Parameters parameters;

    @Override
    public String toString() {
        return "Tariff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", operatorName='" + operatorName + '\'' +
                ", payRoll=" + payRoll +
                ", callPrices=" + callPrices +
                ", smsPrice=" + smsPrice +
                ", parameters=" + parameters +
                '}';
    }

    public Tariff(int id, String name, String operatorName, int payRoll, CallPrices callPrices, int smsPrice, Parameters parameters) {
        this.id = id;
        this.name = name;
        this.operatorName = operatorName;
        this.payRoll = payRoll;
        this.callPrices = callPrices;
        this.smsPrice = smsPrice;
        this.parameters = parameters;
    }

    public Tariff() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public int getPayRoll() {
        return payRoll;
    }

    public void setPayRoll(int payRoll) {
        this.payRoll = payRoll;
    }

    public CallPrices getCallPrices() {
        return callPrices;
    }

    public void setCallPrices(CallPrices callPrices) {
        this.callPrices = callPrices;
    }

    public int getSmsPrice() {
        return smsPrice;
    }

    public void setSmsPrice(int smsPrice) {
        this.smsPrice = smsPrice;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }
}
