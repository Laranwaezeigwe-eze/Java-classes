package chapterTwo;

import java.util.Scanner;

public class Kata {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();

        int numberToDivideWith = 1;
        while (number >= numberToDivideWith) {
            if (number % numberToDivideWith == 0)
                System.out.printf("%d ",numberToDivideWith);
            numberToDivideWith++;
        }

    }
}
