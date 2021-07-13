package Algorithms;

import java.util.Arrays;

public class ProductArray {
    public static int[] productArray(int[] arrayNums){
        int[]newArray = new int[arrayNums.length];
        for (int i=0; i< arrayNums.length; i++){
            int product = 1;
            for(int j=0; j< arrayNums.length; j++){
                if(i==j){
                    continue;
                }
                product *= arrayNums[j];;
            }
           newArray[i]= product;   ;

        }


        return newArray;
    }
public static void main(String[] args) {

        int[]array = {1,2,3,4};
        int[]newArray = new int[array.length];
        System.out.println(Arrays.toString(productArray(array)));
    }
}
