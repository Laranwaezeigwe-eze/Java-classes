package chapterFour;


import java.util.Scanner;

public class EnforcingPrivacy {


   public int encrypt(int message) {

       int firstDigit = message / 1000;
       firstDigit += 7;
       firstDigit %= 10;

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

       return thirdDigit + fourthDigit + firstDigit + secondDigit;
   }

   public int decrypt(int message){

       int firstDigit = message / 1000;
       int remainingMessage = message % 1000;
       int secondDigit = remainingMessage / 100;
       remainingMessage = message % 100;
       int thirdDigit = remainingMessage / 10;
       remainingMessage = message % 10;
       int fourthDigit = remainingMessage;

       if(firstDigit <= 7){
           firstDigit += 10 -7;}
       else firstDigit -= 7;

       if(secondDigit <= 7){
           secondDigit += 10 -7;}
       else secondDigit -= 7;

       if(thirdDigit <= 7){
           thirdDigit += 10 -7;}
       else thirdDigit -= 7;

       if(fourthDigit <= 7){
           fourthDigit += 10 -7;}
       else fourthDigit -= 7;

       thirdDigit *= 1000;
       fourthDigit *= 100;
       firstDigit *= 10;

       return thirdDigit + fourthDigit + firstDigit + secondDigit;

       }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        EnforcingPrivacy privacy = new EnforcingPrivacy();
        System.out.print("Enter integer to encrypt: ");
        int message = input.nextInt();
        System.out.println(privacy.encrypt(message));
        System.out.println(privacy.decrypt(privacy.encrypt(message)));



    }

//        encryptedInteger = thirdDigit + fourthDigit + firstDigit + secondDigit;
//        System.out.println(" Encrypted integer is: " + encryptedInteger);

//        int decryptedInteger = firstDigit + secondDigit + thirdDigit + fourthDigit;
//        System.out.println("Decrypted Integer is: " + decryptedInteger);


   }


