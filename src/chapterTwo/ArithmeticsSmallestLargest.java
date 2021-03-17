package chapterTwo;

import java.util.Scanner;

public class ArithmeticsSmallestLargest {

    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;
        int thirdNumber;

        Scanner input = new Scanner(System.in);

        System.out.println("Input first number: ");
        firstNumber = input.nextInt();

        System.out.println("Input second number: ");
        secondNumber = input.nextInt();

        System.out.println("Input third number: ");
        thirdNumber = input.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;
        System.out.println("Sum is : "+ sum);

        int product = firstNumber * secondNumber * thirdNumber;
        System.out.println("Product is: " + product);

        int average = sum / 3;
        System.out.println("Average is: " + average);

        int smallestNumber;
        int largestNumber;

            largestNumber = thirdNumber;
            smallestNumber = thirdNumber;
            largestNumber = secondNumber;
            smallestNumber = secondNumber;
            largestNumber = firstNumber;
            smallestNumber = firstNumber;
            if (smallestNumber > 0) {
                if (firstNumber > largestNumber) {
                    largestNumber = firstNumber;
                }
                if (secondNumber > largestNumber) {
                    largestNumber = secondNumber;
                }
                if (thirdNumber > largestNumber) {
                    largestNumber = thirdNumber;
                }

                if (firstNumber < smallestNumber) {
                    smallestNumber = firstNumber;
                }
                if (secondNumber < smallestNumber) {
                    smallestNumber = secondNumber;
                }
                if (thirdNumber > smallestNumber) {
                    smallestNumber = thirdNumber;
                }
            }
        System.out.println("The largest number is: "+ largestNumber);
        System.out.println("The smallest number is: "+ smallestNumber);

         }

        }

