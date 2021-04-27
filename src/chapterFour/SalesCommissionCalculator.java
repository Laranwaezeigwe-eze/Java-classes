package chapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        double weeklyWage = 200;
        double commission = 0.09;
        double grossSales1 = 0;
        double grossSales2 = 0;
        double grossSales3 = 0;
        double grossSales4 = 0;
        double totalGrossSales = 0;
        int quantityOfItems;
        double valueItem;
        int items;
        int counter = 0;

        while (counter < 7){
        System.out.print("Enter item number from 1-4: ");
        items = input.nextInt();

        System.out.print("Enter quantity of Items sold: ");
        quantityOfItems = input.nextInt();


        if (items == 1){
            valueItem = 239.99;
             grossSales1 = quantityOfItems * valueItem;
            System.out.println("Gross sales is:$ "+ grossSales1);


            }
        if (items == 2){
            valueItem = 129.75;
            grossSales2 = quantityOfItems * valueItem;
            System.out.println("Gross sales is:$ "+ grossSales2);

        }
        if(items ==3){
            valueItem = 99.95;
            grossSales3 = quantityOfItems * valueItem;
            System.out.println("Gross sales is:$ "+ grossSales3);

        }
        if(items ==4){
            valueItem = 350.89;
            grossSales4 = quantityOfItems * valueItem;
            System.out.println("Gross sales is:$ "+ grossSales4);

        }
        totalGrossSales = grossSales1 + grossSales2 + grossSales3 + grossSales4;
            System.out.println("Total weekly sales:$ "+ totalGrossSales);

        counter++;
        }

        double earnings = weeklyWage + (commission * totalGrossSales);
        System.out.println("Last week earning is:$ "+ earnings);










    }


    }
