package SelfPractice;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter fourgit add double values");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double number4 = input.nextDouble();

        double result = maximum(number1, number2, number3, number4);
        System.out.println("Maximum value is: " + result);


    }

    private static double maximum(double value1, double value2, double value3, double value4 ) {

        double maximumValue = value1;

        if(value2 > maximumValue)
            maximumValue = value2;

        if(value3 > maximumValue)
            maximumValue = value3;

        if(value4 > maximumValue)
            maximumValue = value4;

        return maximumValue;
    }
}
