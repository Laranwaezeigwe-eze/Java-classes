package chapterfive;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int counter = 0;
        int number;
        int astericks = 0;
        int firstNumber=0, secondNumber=0, thirdNumber=0, fourthNumber=0, fifthNumber=0;


        while (counter < 5) {
            System.out.println("Enter number: ");
            number = input.nextInt();
            if (counter == 0 && number >=1 && number <=30){
                firstNumber = number;
                counter++;
            }else if(counter ==1 && number >=1 && number <=30){
                secondNumber = number;
                counter++;
            }else if(counter ==2 && number >=1 && number <=30){
                thirdNumber = number;
                counter++;
            }else if(counter ==3 && number >=1 && number <=30){
                fourthNumber = number;
                counter++;
            }else if(counter ==4 && number >=1 && number <=30){
                fifthNumber = number;
                counter++;
            }
        }
        for(int i=0; i<5; i++){
            if(i==0){
               astericks = firstNumber;
            }else if(i ==1){
                astericks = secondNumber;
            }else if(i==2){
                astericks = thirdNumber;
            }else if(i==3){
                astericks = fourthNumber;
            }else if(i ==4){
                astericks = fifthNumber;
            }
            for(int t =astericks; t>0; t--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}