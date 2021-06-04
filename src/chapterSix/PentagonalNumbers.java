package chapterSix;

public class PentagonalNumbers {

    public static int getPentagonalNumber(int n){

        return n*(3*n - 1)/2;
    }

    public static void main(String[] args) {

        for(int i=1; i <= 100; i++){
            if(i % 10 ==0 ){
                System.out.println();
            }
            System.out.print(getPentagonalNumber(i)+",");
        }
    }


   }




