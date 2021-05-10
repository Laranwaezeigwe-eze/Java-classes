package chapterFour;


import java.util.Scanner;

public class EnforcingPrivacy {
    public static void main(String[] args) {

//    public int encrypt(int message){
        Scanner input = new Scanner(System.in);

        int encryptedInteger;
        int message;

        System.out.println("Enter the four digit integer: ");
        message = input.nextInt();

        int firstDigit = message / 1000;

        int remainingMessage = message % 1000;
        int secondDigit = remainingMessage / 100;
        secondDigit += 7;
        secondDigit %= 10;

        remainingMessage = message % 100;
        int thirdDigit = remainingMessage / 10;
        thirdDigit += 7;
        thirdDigit %= 10;

        remainingMessage = message % 10;
        int fourthDigit = remainingMessage / 1;
        fourthDigit += 7;
        fourthDigit %= 10;

        thirdDigit *= 1000;
        fourthDigit *= 100;
        firstDigit *= 10;

        encryptedInteger = thirdDigit + fourthDigit + firstDigit + secondDigit;
        System.out.println(" Encrypted integer is: " + encryptedInteger);



    }


}
