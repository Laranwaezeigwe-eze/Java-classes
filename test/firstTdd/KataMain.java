package firstTdd;

import chapterTwo.Kata;

public class KataMain {
    public static void main(String[] args) {
      int[]  arrays = {1,2,7,8,9};
        System.out.println(KataArray.getMaximum(arrays));
        System.out.println(KataArray.getMinimum(arrays));
        System.out.println(KataArray.sum(arrays));

        System.out.println(KataArray.sum(arrays)-KataArray.getMinimum(arrays));
        System.out.println(KataArray.sum(arrays)-KataArray.getMaximum(arrays));
        System.out.println(KataArray.average(arrays));
    }

}
