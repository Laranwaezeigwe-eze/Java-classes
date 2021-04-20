package chapterThree;

import java.util.Scanner;

public class HealthProfilesTest {
    public static void main(String[] args) {
        HealthProfiles patient = new HealthProfiles();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First name: ");
        String firstName = input.next();

        System.out.print("Enter Last name: ");
        String lastName = input.next();

        System.out.print("Enter Month of Birth: ");
        int monthOfBirth = input.nextInt();
        patient.setMonthOfBirth(monthOfBirth);

        System.out.print("Enter Day of Birth: ");
        int dayOfBirth = input.nextInt();
        patient.setDayOfBirth(dayOfBirth);

        System.out.print("Enter Year of Birth: ");
        int yearOfBirth = input.nextInt();
        patient.setYearOfBirth(yearOfBirth);

//        System.out.println("Gender: "+ patient.getGender());
//        String gender = input.next();
//        patient.setGender(gender);

        System.out.printf("Date of Birth is: %d/%d/%d%n", dayOfBirth, monthOfBirth, yearOfBirth);


        System.out.println("Age: "+ patient.getAge()+" years ");

        System.out.println("Weight in Pounds: ");
        double weight = input.nextDouble();

        System.out.println("Height in Inches: ");
        double height = input.nextDouble();

        double BMI = (weight / (height * height)) * 703;
        System.out.println("BMI = "+ BMI);


        System.out.println("Maximum heart rate: "+ patient.maximumHeartRate());

        System.out.println(patient.targetHeartRate());

        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");

    }

    }

