public class TwoDayPackage extends Package{
    private double flatFee;

    public TwoDayPackage(String senderName, String senderAddress, String senderCity, String senderState, String senderZip,
                         String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZip,
                         double weight, double costPerOunce, double flatFee)
    {
        super(weight, costPerOunce);

        //Check flatfee is positive
        if (flatFee>0) {
            this.flatFee = flatFee;
        } else {
            this.flatFee = 0;
        }
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + flatFee;
    }

    @Override
    public double calculateCost(double weight, double costPerOunce) {
        return 0;
    }
}


