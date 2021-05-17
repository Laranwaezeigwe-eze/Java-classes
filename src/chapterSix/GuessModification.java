package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessModification {

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
                counter++;

            }
            System.out.println(guessCount(counter));
            return "The correct number is  "+number;


        }
        public static String guessCount(int count){

            String display=" ";

            if(count < 10){
              display = "The total number of guesses is:"+ count +"\n Either you know the secret or you got lucky!";
            }
            else if(count == 10){
                display = "The total number of guesses is:"+ count +"\n Aha! you know the secret!";
            }
            else if(count > 10){
                display = "The total number of guesses is:" + count +"\n You should be able to do better!";
            }
            return display;
        }
        public static void main(String[] args) {

            System.out.println(guessGame());
           // System.out.println(guessCount(2));
        }
    }


