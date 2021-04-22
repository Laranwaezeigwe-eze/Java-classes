package chapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int counter = 0;
            while (counter < 2) {
            System.out.printf("Input account Number: ");
            int accountNumber = input.nextInt();

            System.out.printf("Balance @ beginning of the Month:$");
            int beginningBalance = input.nextInt();

            System.out.printf("Total charges of items incurred:$");
            int totalCharges = input.nextInt();

            System.out.printf("Total credit applied to customer account:$");
            int totalCredits = input.nextInt();

            System.out.printf("Allowed credit limit:$");
            int creditLimit = input.nextInt();

            int newBalance = beginningBalance + totalCharges - totalCredits;
            System.out.println("The new balance is:$" + newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit Limit Exceeded");
                break;
            }

        }


    }
}