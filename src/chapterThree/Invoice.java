package chapterThree;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantityOfItemsToBePurchased;
    private double pricePerItem;

    public Invoice(String partNumber,String partDescription,int quantityOfItemsToBePurchased,double pricePerItem){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantityOfItemsToBePurchased = quantityOfItemsToBePurchased;
        this.pricePerItem = pricePerItem;

    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public int getQuantityOfItemsToBePurchased() {
        return quantityOfItemsToBePurchased;
    }

    public void setQuantityOfItemsToBePurchased(int quantityOfItemsToBePurchased) {
        this.quantityOfItemsToBePurchased = quantityOfItemsToBePurchased;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
    double amount;
    public double getInvoiceAmount() {
           amount = quantityOfItemsToBePurchased * pricePerItem;
           if(quantityOfItemsToBePurchased< 0)
               amount = 0;
           if(pricePerItem < 0.0)
               amount = 0.0;

        return amount;
    }

}
