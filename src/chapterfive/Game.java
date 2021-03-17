package chapterfive;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        
        int useNumber1 = 10;
        int counter = 0;
        int numberToGuess = 20;
        



        while (counter < useNumber1) {
            System.out.println("Guess user input: ");
            useNumber1 = input.nextInt();

             if(useNumber1 == numberToGuess) {
                System.out.print("wrong!");

            }
               else
                   if(useNumber1 > numberToGuess){
                System.out.print("Try again");


                   }

               else {
                System.out.print("correct!!");

                   }
            counter++;
            System.out.println();


        }


    }
}