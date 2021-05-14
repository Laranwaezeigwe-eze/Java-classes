package chapterSix;

import java.util.Scanner;

public class MinimumFinder {

    public  static float minimum3(float number1, float number2, float number3){
        Math.min(number1, Math.min(number2, number3));
        return Math.min(number1, Math.min(number2, number3));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three values: ");

        float firstNumber = input.nextFloat();
        float secondNumber = input.nextFloat();
        float thirdNumber = input.nextFloat();

        System.out.println("Smallest number is: "+ Math.min(firstNumber, Math.min(secondNumber, thirdNumber)));

    }
}
