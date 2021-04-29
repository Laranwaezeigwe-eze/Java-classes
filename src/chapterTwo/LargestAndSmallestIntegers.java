package chapterTwo;

import java.util.Scanner;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest;
        int smallest;
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int fourthNumber;
        int fifthNumber;


        System.out.println("Enter number: ");
         firstNumber = input.nextInt();
        System.out.println("Enter number: ");
         secondNumber = input.nextInt();
        System.out.println("Enter number: ");
        thirdNumber = input.nextInt();
        System.out.println("Enter number: ");
        fourthNumber = input.nextInt();
        System.out.println("Enter number: ");
        fifthNumber = input.nextInt();


        largest = firstNumber;

        if(secondNumber > largest){
            largest = secondNumber;}

        if (thirdNumber > largest){
            largest = thirdNumber;}

        if (fourthNumber > largest){
            largest = fourthNumber;}

        if (fifthNumber > largest){
            largest = fifthNumber;}
        System.out.println("Largest number: "+ largest);

        smallest = firstNumber;

        if (secondNumber < smallest){
            smallest = secondNumber;}

        if (thirdNumber < smallest){
            smallest = thirdNumber;}

        if (fourthNumber < smallest){
            smallest = fourthNumber;}

        if (fifthNumber < smallest){
            smallest = fifthNumber;}

        System.out.println("Smallest number: "+ smallest);


    }

}
