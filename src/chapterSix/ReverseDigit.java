package chapterSix;

import java.util.Scanner;

public class ReverseDigit {

    public static int reverse(int number){
        int reverse = 0;
        int remainder;
        while(number != 0){
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to reverse: ");
        int number= input.nextInt();
        System.out.print("Reversed digit is: "+ reverse(number));
    }


}
