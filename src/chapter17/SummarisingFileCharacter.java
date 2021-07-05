package chapter17;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SummarisingFileCharacter {
    public static void readCharacterOccurrence() {
        try
                (Formatter formatter = new Formatter("src/chapter17/Concordance.txt")) {
            Scanner input = new Scanner(System.in);
            {
                System.out.println("Enter a sentence and ENTER CTRL D to end");
                formatter.format("%s%n", "Text");

                while (input.hasNext()) {
                    String text = input.next();
                    formatter.format("%s ", text);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

        public static void countWordOccurrence(){
        Pattern pattern = Pattern.compile("");
            try {
                Map<String, Long> CharacterCounts =
                        Files.lines(Paths.get("src/chapter17/Concordance.txt"))
                                .map(line -> line.replaceAll("(?!')\\p{P}", ""))
                                .flatMap(line -> pattern.splitAsStream(line))
                                .collect(Collectors.groupingBy(String::toLowerCase,
                                        TreeMap::new, Collectors.counting()));
                CharacterCounts.entrySet()
                        .stream()
                        .collect(
                                Collectors.groupingBy(entry -> entry.getKey().charAt(0),
                                        TreeMap::new, Collectors.toList()))
                        .forEach((letter, wordList) ->
                        {
                            System.out.printf("%n%C%n", letter);
                            wordList.forEach(word -> System.out.printf(
                                    "%13s: %d%n", word.getKey(), word.getValue()));
                        });
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

    public static void main(String[] args) {
//        readCharacterOccurrence();
        countWordOccurrence();
    }


    }

