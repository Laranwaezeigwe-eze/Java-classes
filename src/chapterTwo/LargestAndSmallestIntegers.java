package chapterTwo;

import java.util.Scanner;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest;
        int smallest;
        int allNumber = 0;
        int firstNumber = allNumber;
        int secondNumber = allNumber;
        int thirdNumber = allNumber;
        int fourthNumber = allNumber;
        int fifthNumber = allNumber;

        largest = allNumber;
        smallest = allNumber;

        System.out.println("Enter number: ");
         allNumber = input.nextInt();
        System.out.println("Enter number: ");
         allNumber = input.nextInt();
        System.out.println("Enter number: ");
        allNumber = input.nextInt();
        System.out.println("Enter number: ");
        allNumber = input.nextInt();
        System.out.println("Enter number: ");
       allNumber = input.nextInt();



        if(allNumber > largest){
            largest = allNumber;}
        else
            if (allNumber < largest)
                smallest = allNumber;


        System.out.println("Largest number: "+ largest);
        System.out.println("Smallest number: "+ smallest);


    }

}
