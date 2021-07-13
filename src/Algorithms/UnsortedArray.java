package Algorithms;

import java.util.Arrays;

public class UnsortedArray {
    public static void sortArray(int[]number) {

        for(int i=0; i <number.length; i++){
            for(int j= i+1; j< number.length; j++){
                int unsortedArray = number[i];
                if(number[i] > number[j]){

                    number[i]= number[j];
                    number[j]= unsortedArray;
                }
            }
        }
        System.out.println(Arrays.toString(number));


        int firstIndex =-1;
        int lastIndex =-1;
        int valueToCompare = 0;
        for(int i=0; i<number.length;i++){
            if(number[i]==valueToCompare && firstIndex==-1){
                firstIndex=i;
                break;
            }
            for(int j= number.length-1; j> 0; j--){
                if(number[j]==valueToCompare && lastIndex==-1){
                    lastIndex=j;
                    break;
                }
        }
    }
        System.out.println(firstIndex +" "+ lastIndex);
        }



    public static void main(String[] args) {
        int[]array = {2,0,-7,3,1,2,0,-2,7,4,2,3};
        sortArray(array);
    }

}