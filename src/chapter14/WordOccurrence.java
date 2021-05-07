package chapter14;


public class WordOccurrence {

    public static int wordOccurence(String str, String word) {
        String[] a = str.split(" ");

        int counter = 0;
        for (int i = 0; i< a.length; i++) {
            if(word.equals(a[i])){
                counter++;
            }
        }

        return counter;

    }

    public static void main(String[] args) {
        String str = " She is as fat as the sheep is as black as the goat";
        String word = "as";
        System.out.println(wordOccurence(str, word));
    }

}
