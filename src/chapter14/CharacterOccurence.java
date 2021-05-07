package chapter14;

public class CharacterOccurence {
    public static void main(String[] args) {
        String letter = "Telephone";
        char leta = 'e';

        int counter = 0;
        for(int i = 0; i < letter.length(); i++){
            if(letter.charAt(i)==leta){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
