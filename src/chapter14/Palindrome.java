package chapter14;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            System.out.println("Enter a string: ");
            String userInput = input.next();
            StringBuilder sb = new StringBuilder(userInput);

            StringBuilder reservedUserInput = sb.reverse();

            if (userInput.equals(String.valueOf(reservedUserInput))) {
                System.out.println("This is Palindrome");
            } else {
                System.out.println("This is not a Palindrome");

            }

        }

    }
}
