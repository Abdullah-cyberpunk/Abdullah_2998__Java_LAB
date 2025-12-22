//this is Home Task No 2
public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent(){
        double ChangePercent = (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
        System.out.println("The Change Percent is: " + ChangePercent);
        return ChangePercent;
    }
    //Testing code in main method
public static void main(String[] args) {

    System.out.println("Home task No 2");
    Stock Google = new Stock("GOOGLE", "Google LLC",  68.97, 88.1);
    Google.getChangePercent();

    System.out.println("\n");
    }
}
