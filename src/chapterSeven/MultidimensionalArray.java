package chapterSeven;

public class MultidimensionalArray {
    public static void main(String[] args) {


        int[][] array = new int[4][4];
        array[1][2]=6;
        array[2][0]=1;
        array[3][3]=22; 


        for (int rowCount =0; rowCount < array.length; rowCount++) {
            for (int columnCount = 0; columnCount < array[rowCount].length; columnCount++)

                System.out.print(" "+ array[rowCount][columnCount]);
            System.out.println();
            }

        }
    }
