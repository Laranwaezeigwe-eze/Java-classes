package firstTdd;

public class KataArray {
    public  static int sum(int [] array){
        int counter = 1;
        int sum = array[0];
        for(; counter < array.length; counter++)
            sum += array[counter];
     //int sumOfArray = array[0]+ array[1]+ array[2]+ array[3];
            return sum;
    }

    public static double average(int[]array){
        double average = sum(array)/(array.length*1.0);
        return average;
    }

    public static int getMaximum(int[] arrays){
        int maximumNumber = arrays[0];
        int counter = 0;
        while (counter < arrays.length){
            if(arrays[counter] > maximumNumber){
                maximumNumber = arrays[counter];
            }
            counter++;
        }
        return maximumNumber;
    }


    public static int getMinimum(int[] arrays) {
       int minimumNumber = arrays[0];
       int counter = 0;
       while(counter < arrays.length){
           if(arrays[counter] < minimumNumber){
               minimumNumber = arrays[counter];
           }
           counter++;
       }
       return minimumNumber;
    }
}
