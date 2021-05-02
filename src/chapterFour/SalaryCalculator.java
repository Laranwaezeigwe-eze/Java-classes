package chapterFour;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numberOfStraightHoursWorked = 40;
        double hourlyRate = 100;
        double excessHoursWorked;
        int totalHoursWorked = 0;
        double grossPay;
        double overtimePay = 0;
        double straightHoursPay = 0;
        int counter = 0;


        while (counter < 3) {
            System.out.println("For each Employee:");

            System.out.print("Enter number of total hours worked incl. extra hours: ");
            totalHoursWorked = input.nextInt();


            excessHoursWorked = totalHoursWorked - numberOfStraightHoursWorked;
            System.out.println("Excess hours worked: "+ excessHoursWorked);

            if (totalHoursWorked <= 40) {
                straightHoursPay = hourlyRate * numberOfStraightHoursWorked;
                System.out.println("Employee straight pay is:# "+ straightHoursPay);
            }
            if (totalHoursWorked > 40) {
               overtimePay = hourlyRate * 1.5 * excessHoursWorked;
                System.out.println("Employee overtime pay is:# "+ overtimePay);
                straightHoursPay = hourlyRate * numberOfStraightHoursWorked;
                grossPay = overtimePay + straightHoursPay;
                System.out.println("Employee gross pay is:#"+ grossPay);
            }

            counter++;
        }
    }
}