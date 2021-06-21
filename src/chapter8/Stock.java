package chapter8;

public class Stock {
    String symbol;
    String name;
    double currentPrice;
    double previousClosingPrice;

    public  Stock(String symbol, String name){
           this. symbol = symbol;
           this. name = name;
    }

    public Stock(String symbol, String name, double previousClosingPrice) {
        this.symbol = symbol;
        this.name = name;
        currentPrice = previousClosingPrice;
    }

    public double getChangePercent(){
        return currentPrice;
       }

    public void setCurrentPrice(double currentPrice) {

           this.currentPrice = currentPrice;
    }


    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation", 34.5);
        System.out.println("The change percent is: "+ stock.getChangePercent());
        stock.setCurrentPrice(34.35);
        System.out.println("Price-change percentage: "+ stock.getChangePercent());
    }
}
