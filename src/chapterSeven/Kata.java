package chapterSeven;

import java.security.SecureRandom;
import java.util.Arrays;

public class Kata {
    public static int[] shuffleArray(int[]array){

        SecureRandom randomizer = new SecureRandom();
        int random = randomizer.nextInt(array.length);
        for(int i = 0; i< array.length; i++){
            int number = array[i];
            array[i] = array[random];
            array[random] = number;
        }
        return array;
    }

    public static int[] sortArray(int[] array){
        int[]arrangedArray = new int[array.length];
        for(int i = 0; i< array.length-1; i++){
          if(arrangedArray[i] > arrangedArray[i+1]){
                 int number = arrangedArray[i];
                 arrangedArray[i] = arrangedArray[i+1];
                 arrangedArray[i+1] = number;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int []number = {1,4,6,3,8,2,10};
        System.out.println(Arrays.toString(shuffleArray(number)));
       int[]array = {14,17,15,20};
        System.out.println(Arrays.toString(sortArray(array)));
    }

}
