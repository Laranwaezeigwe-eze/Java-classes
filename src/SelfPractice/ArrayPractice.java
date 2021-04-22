package SelfPractice;

import java.util.Scanner;

public class ArrayPractice {
       private static Scanner scanner = new Scanner(System.in);
    public static int[]getInteger(int number){
        int[]array = new int[number];

        System.out.println("Enter numbers: \r");
        for(int i=0; i< array.length;i++){
           array[i]= scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[]array){

        for (int i=0; i<array.length;i++){
            System.out.println("Print content of array: "+ array[i]);
        }
    }

    public static int[] sortIntegers(int[]array){
        int[]sortedArray = new int[array.length];
        for(int i=0; i< array.length; i++){
            sortedArray[i]= array[i];

        }
        boolean flag = true;
        int temp ;
        while(flag){
            flag=false;

            for (int i=0; i< sortedArray.length-1; i++){
                if(sortedArray[i]< sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1]= temp;
                    flag= true;
                }
            }

        }
        return sortedArray;
    }







    public static void main(String[] args) {
        int[]myInteger = getInteger(5);
        int[] sorted = sortIntegers(myInteger);
        printArray(sorted);

        }
    }

