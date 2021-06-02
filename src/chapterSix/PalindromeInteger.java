package chapterSix;

import java.util.Scanner;

public class PalindromeInteger {
    public static int reverse(int number){
        int reverse = 0;
        int remainder;
        while(number !=0){
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        return reverse;
    }
    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int remainder;
        int temp = number;

        while(number > 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
            if(temp == reverse){
                System.out.println("Its Palindrome");
            }else{
                System.out.println("Its not Palindrome");
            }


//        while (number != 0) {
//            remainder = number % 10;
//            reverse = reverse * 10 + remainder;
//            number /= 10;
//            int temp = reverse;
//            reverse = number;
//            number = temp;
//
//            if (reverse == temp) {
//                System.out.println("its Palindrome");
//            } else
//                System.out.println("its not Palindrome");
//            return false;
        return true;
        }



        public static void main (String[]args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter an Integer: ");
            int number = input.nextInt();
            isPalindrome(number);

        }

    }