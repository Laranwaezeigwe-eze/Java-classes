package Algorithms;

import java.util.Scanner;

public class PrintMultiplication {
    public static int multiplication(int n){
        int i= 1;
        int result = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        n = input.nextInt();
        while (i >=1 && i <= 10){
            result = n*i;

            System.out.println(n +"*"+ i +"= "+ result);
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("n-multiplication: "+ multiplication(10));
    }
}
