package chapter14;

import java.util.Scanner;

public class ComparingStrings {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("Enter string value to compare: ");
        String userInput1 = input.nextLine();

        System.out.println("Enter second string value to compare: ");
        String userInput2 = input.nextLine();

        int answer = userInput1.compareTo(userInput2);

        if(answer == 0){
            System.out.println("UserInput1 is equal to UserInput2 i.e: "+ userInput1.compareTo(userInput2));
        }
        else
            if(answer < 0){
            System.out.println("UserInput1 is lower to UserInput2 i.e: "+ userInput1.compareTo(userInput2));
        }
            else
            if(answer > 0){
                System.out.println("UserInput1 is higher to UserInput2 i.e: "+ userInput1.compareTo(userInput2));
            }


    }
}
