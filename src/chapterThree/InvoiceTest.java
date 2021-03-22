package chapterThree;


public class InvoiceTest {
    public static void main(String[] args) {

        Invoice invoice = new Invoice("230-4","Grinder",4,-1200.00);

      System.out.printf("PART NUMBER: %s%nPART DESCRIPTION: %s%nQUANTITY: %d%nPRICE: %.2f%n",invoice.getPartNumber(), invoice.getPartDescription(),
       invoice.getQuantityOfItemsToBePurchased(), invoice.getPricePerItem());

        invoice.getInvoiceAmount();
        System.out.printf("Invoice amount is :#%.2f%n", invoice.getInvoiceAmount());





    }
}