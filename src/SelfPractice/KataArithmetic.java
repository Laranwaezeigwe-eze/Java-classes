package SelfPractice;

public class KataArithmetic {
   public static int apNumber(int a1, int a2, int a3){

      int a4 = 0;
      int diff = a2 - a1;
      if(a2-a1== diff && a3-a2 ==diff){
          a4 = a3 + diff;
      }
      return a4;
   }

   public static void main(String[] args) {
      System.out.println(apNumber(2,4,));
   }



}

