package chapterSix;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static int gcd(int firstNumber, int secondNumber){
        int gcd = 1;
        int divisor = 2;

        while(divisor <= firstNumber && divisor <= secondNumber){
            if(firstNumber % divisor == 0 && secondNumber % divisor ==0){
                gcd = divisor;
            }
            divisor++;
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int number1 = input.nextInt();
        System.out.println("Enter second number: ");
        int number2 = input.nextInt();

        System.out.println("The greatest common divisor is: "+ gcd(number1,number2));
    }
}
