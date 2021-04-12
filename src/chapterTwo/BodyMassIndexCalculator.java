package chapterTwo;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        int weightInKilograms;
        double heightInMeters;
        double BMI;

        Scanner input = new Scanner(System.in);
        System.out.println("Weight in kg: ");
         weightInKilograms = input.nextInt();

        System.out.println("Height in meters: ");
        heightInMeters = input.nextDouble();

        BMI = weightInKilograms / (heightInMeters * heightInMeters);
        System.out.println("BMI = "+ BMI);

        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");










    }
}
