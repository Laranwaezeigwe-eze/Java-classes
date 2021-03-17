package chapterFour;

import java.util.Scanner;

public class Kata {

 /*
     public double calculateAverage(int number1, int number2, int number3){
        double average = (number1 + number2 + number3)/3.0;
      return average;
    }
    public String calculateGrade(int score){
       if(score >= 90)
          return"Grade A";
  */

    /* else */
    // if(score>=80)
    //      return"Grade B";
    //  else
    //if(score>=70)
    //  return"Grade C";
    //else
    //if(score>=60)
    //  return"Grade D";

    //else
    //  return "F";

    // public boolean isEven(int number){

    // if(number%2==0) return true;
    //     else return false;

   /* public boolean isPrime(int numberPrime) {
        boolean isPrime = false;
        int factor = 0;
        int counter = 2;

        while (counter < numberPrime) {
            if (numberPrime % counter == 0) {
                factor++;
            }
            counter++;
        }

        if (factor > 0) {
            isPrime = false;
        } else {
            isPrime = true;
        }

        return isPrime;
    }
    **/

    public int testDrillerPrice() {
        Scanner input = new Scanner(System.in);
        int price = 0;

        System.out.println("Enter number of copies: ");
        int userRequest = input.nextInt();


            if (userRequest<= 4) {
              return price = userRequest * 1500;
            }
            if (userRequest<= 9) {
                price = userRequest * 1400;
            }
            if (userRequest <= 29) {
                price = userRequest * 1200;
            }
            if (userRequest <= 49) {
                price = userRequest * 1100;
            }
            if (userRequest<= 99) {
                price = userRequest * 1000;
            }
            if (userRequest <= 199) {
                price = userRequest * 900;
            } else if
                (userRequest>=200) {
                price = userRequest * 800;

            }
        return price;
            }

        }


