package chapterSix;

import java.util.Scanner;

public class StudentAverage {

    public static double qualityPoint(double score){
        int point;
        if(score >=90 && score <=100){
            point = 4;
        }
        else if(score >=80 && score <=89){
            point = 3;
        }
       else if(score >=70 && score <=79){
            point = 2;
        }
       else if(score >=60 && score <=69){
            point = 1;
        }
       else point = 0;

       return point;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter average score: ");
        int point = userInput.nextInt();
        System.out.println("Point is: "+ qualityPoint(point));



    }
}

