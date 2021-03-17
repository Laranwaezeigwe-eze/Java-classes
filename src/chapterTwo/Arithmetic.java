package chapterTwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        int number1;  int product;
        int number2;  int difference;
        int sum;      int division;

        Scanner input = new Scanner(System.in);

        System.out.print("Input number1: ");
        number1 = input.nextInt();

        System.out.print("Input number2: ");
        number2 = input.nextInt();

        sum = number1 + number2;
        System.out.println("Sum is: " + sum);

        product = number1 * number2;
        System.out.println("Product is: "+ product);

        difference = number1 - number2;
        System.out.println("Difference is: "+ difference);

        division = number1 * number2;
        System.out.println("Quotient is: "+ division);
    }
}
