package chapterfive;

import java.util.Scanner;

public class Kata {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int number = 0;
        int counter = 1;
        int maximum = 0;
        int minimum = 0;

        while (counter <= 5){
            System.out.println("Enter number: ");
            number = input.nextInt();

            if(counter == 1) {
                maximum = number;
                minimum = number;
            }

            if (number > maximum){
                maximum = number;

            }
            if (number < maximum){
                minimum = number;
            }
            counter++;

        }
        System.out.println("The Maximum Number is " + maximum);
        System.out.println("The Minimum Number is " + minimum);
    }
}
