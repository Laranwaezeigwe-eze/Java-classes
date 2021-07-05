package chapter17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;



public class Invoice {
    private int partNumber;
    private String partDescription;
    private int quantity;
    private double price;
    public Invoice(int partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }
    public String getPartDescription() {
        return partDescription;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString(){
        return String.format("%-10d%-20s%15d%12.2f",partNumber, partDescription, quantity, price);
    }

    public static void main(String[] args) {


        Invoice [] invoices = {
                new Invoice(83, "Electric sander", 7, 57.98),
                new Invoice(24, "Power saw", 18, 99.99),
                new Invoice(7, "Sledge Hammer", 11, 21.50),
                new Invoice(77, "Hammer", 76, 11.99),
                new Invoice(39, "Lawn Mower", 3, 79.50),
                new Invoice(68, "Screwdriver", 106, 6.99),
                new Invoice(56, "Jig saw", 21, 11.00),
                new Invoice(3, "Wrench", 34, 7.50)
        };

        List<Invoice> list = Arrays.asList(invoices.clone());
        System.out.printf("%s %s %20s %8s%n","PartNumber", "PartDescription","Quantity", "Price");
        list.forEach(System.out::println);

        Function<Invoice, String> byPartDescription = Invoice::getPartDescription;
        Comparator<Invoice> description = Comparator.comparing(byPartDescription);
        System.out.printf("%n Part description in ascending order: ");
        System.out.println();
        System.out.printf("%s %s %20s %8s%n","PartNumber", "PartDescription","Quantity", "Price");
        list.stream()
        .sorted(description)
        .forEach(System.out::println);

        Function<Invoice, Double> byPrice = Invoice::getPrice;
        Comparator<Invoice> price = Comparator.comparing(byPrice);
        System.out.printf("%n Price in ascending order: ");
        System.out.println();
        System.out.printf("%s %s %20s %8s%n","PartNumber", "PartDescription","Quantity", "Price");
        list.stream()
        .sorted(price)
        .forEach(System.out::println);

        

        }
}




