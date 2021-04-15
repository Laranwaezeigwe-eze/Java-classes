package chapterThree;

import java.util.Date;
import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        HeartRates health = new HeartRates();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter First name: ");
        String firstName = input.next();

       System.out.print("Enter Last name: ");
       String lastName = input.next();

       System.out.print("Enter Month of Birth: ");
       int monthOfBirth = input.nextInt();
       health.setMonthOfBirth(monthOfBirth);

        System.out.print("Enter Day of Birth: ");
        int dayOfBirth = input.nextInt();
        health.setDayOfBirth(dayOfBirth);

        System.out.print("Enter Year of Birth: ");
        int yearOfBirth = input.nextInt();
        health.setYearOfBirth(yearOfBirth);


       System.out.printf("Date of Birth is: %d/%d/%d", dayOfBirth, monthOfBirth, yearOfBirth);


       System.out.println("Age: "+ health.getAge()+" years ");


        System.out.println("Maximum heart rate: "+ health.maximumHeartRate());

        System.out.println(health.targetHeartRate());
    }
}
