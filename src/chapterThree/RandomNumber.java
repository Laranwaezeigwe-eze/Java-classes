package chapterThree;

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int firstNumber = (int)(Math.random()*50);
        int secondNumber =(int)(Math.random()*50);
        int counter =0;

        int correctAnswerCounter = 0;

        while(counter < 10) {
            if (firstNumber < secondNumber) {
                int swap = firstNumber;
                firstNumber = secondNumber;
                secondNumber = swap;

            }

            System.out.println("What is " + firstNumber + " + " + secondNumber + " ? ");
            int answer = input.nextInt();
            if (firstNumber + secondNumber == answer) {
                System.out.println("Correct");
                correctAnswerCounter++;
            } else
                System.out.println("Wrong");

            System.out.println("What is " + firstNumber + "-" + secondNumber + '?');
            answer = input.nextInt();
            if (firstNumber - secondNumber == answer) {
                System.out.println("Correct");
                correctAnswerCounter++;
            } else
                System.out.println("Wrong");

            System.out.println("What is " + firstNumber + "/" + secondNumber + '?');
            answer = input.nextInt();
            if (firstNumber / secondNumber == answer) {
                System.out.println("Correct");
                correctAnswerCounter++;
            } else
                System.out.println("Wrong");

            System.out.println("What is " + firstNumber + "*" + secondNumber + '?');
            answer = input.nextInt();
            if (firstNumber * secondNumber == answer) {
                System.out.println("Correct");
                correctAnswerCounter++;
            } else
                System.out.println("Wrong");

            System.out.println("total score");

            System.out.println("You got " + correctAnswerCounter + " correct answers");
        }
        ++counter;
    }


}
