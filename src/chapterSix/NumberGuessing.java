package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class NumberGuessing {
    public static String guessGame(){
        Scanner input = new Scanner(System.in);
        SecureRandom secureRandom=new SecureRandom();
        int number=secureRandom.nextInt(1000);

        int counter=0;

        while(counter!=-1) {

            System.out.println("Enter a number to guess in range 1-1000: ");
            int guess = input.nextInt();
            if (guess == number) {
                System.out.print("Congratulations. You guessed the number!");
                break;
            }
           else if (guess < number) {
                System.out.print("Too low. Try again!");

            }
           else if (guess > number) {
                System.out.println("Too high. Try again!");
            }

        }
        return "The correct number is  "+number;

    }

    public static void main(String[] args) {

        System.out.println(guessGame());
    }
}
