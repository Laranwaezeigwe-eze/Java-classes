package chapterFour;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int totalNumberOfInput = 0 ;
        int score;
        int totalScore = 0;

        while (totalNumberOfInput <5) {
            System.out.println("Enter number");
            score = userInput.nextInt();
            totalScore = totalScore + score;
            totalNumberOfInput++;

        }
        double Average = totalScore /(totalNumberOfInput*1.0);
        System.out.println(Average );
    }
}
