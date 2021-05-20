package chapterSix;

import java.util.Scanner;

public class SeparatingDigits {

    public static int quotient(int a, int b) {
        return a / b;
    }

    public static int getRemainder(int a, int b) {
        return a % b;
    }

    public static void displayDigit(int number) {
        if (number >= 1 && number <= 99999) {
            String result = "";
            while (number > 0) {
                int unit = getRemainder(number, 10);
                result = unit + " " + result;
                number = quotient(number, 10);
            }

            System.out.println(result);
        }
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter value: ");
        int number = input.nextInt();
        displayDigit(number);

    }
}