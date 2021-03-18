package chapterSeven;
import java.util.Random ;

public class DiceRolling {
    public static void main(String[] args) {


        int[] diceArray = new int[6];
        System.out.printf("%s%10s%n", "dice", "ArrayUnit");
        for (int counter = 0; counter < diceArray.length; ) {

            int randomNumber = (int) (Math.random() * 6000000);
          diceArray[counter] = randomNumber;

            System.out.printf("%3d%10d%n",counter, diceArray[counter]);
            counter++;
        }


    }
}