package chapter16;

import java.util.*;

public class CountingLetters {
    public static void createMap(Map<Character, Integer> map){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence/ word- ");
        String input = scanner.nextLine();

        char [] letters = input.toCharArray();
        for (char letter : letters) {
            if (map.containsKey(letter)) {
                int count = map.get(letter);
                map.put(letter, count + 1);
            } else {
                map.put(letter, 1);
            }
        }
    }
    public static void displayMap(Map<Character , Integer>map){
        Set<Character> keys = map.keySet();
        TreeSet<Character> sortedKeys = new TreeSet<>(keys);
        System.out.printf("%nMap Contains: %nKeys     Values%n");
        for (char key : sortedKeys){
            System.out.printf("%s%10s%n",key,map.get(key));
        }

//        Set<Map.Entry<Character, Integer>>entrySet = map.entrySet();
//        for(Map.Entry<Character, Integer>entry: entrySet)
//        System.out.println(entry.getKey() + "\t"+ entry.getValue());

    }

    public static void main(String[] args) {
       Map<Character, Integer> myMap = new HashMap<>();
       createMap(myMap);
       displayMap(myMap);
    }
}
