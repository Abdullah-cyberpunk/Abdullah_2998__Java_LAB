public class Package {
    private String senderName, senderAddress, senderCity, senderState, senderZip;
    private String recipientName, recipientAddress, recipientCity, recipientState, recipientZip;

    private double weight;
    private double costPerOunce;

    public Package(Double weight, Double costPerOunce) {
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.senderCity = senderCity;
        this.senderState = senderState;
        this.senderZip = senderZip;
        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.recipientCity = recipientCity;
        this.recipientState = recipientState;
        this.recipientZip = recipientZip;
        this.weight = weight;
        this.costPerOunce = costPerOunce;
//ensure positive weight
        if (weight > 0) {
            this.weight = weight;
        } else {
            this.weight = 0;
        }

        if (costPerOunce > 0) {
            this.costPerOunce = costPerOunce;
        } else {
            this.costPerOunce = 0;
        }

    }
    // Calculate cost
    public double calculateCost() {
        return weight * costPerOunce;
    }

    public double calculateCost(double weight, double costPerOunce) {
        return 0;
    }}
