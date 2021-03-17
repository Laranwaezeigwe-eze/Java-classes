package chapterfive;

import java.util.Scanner;

public class Prompt {
    public static void main(String[] args) {
       String promptMessage = """
               -> Press 1 for Igbo.
               -> Press 2 for Hausa.
               -> Press 3 for Yoruba.
               -> Press 4 for English
               """;
        System.out.println(promptMessage);
        Scanner userInputCollector = new Scanner(System.in);
        int userInput = userInputCollector.nextInt();
        switch (userInput){
            case 1:
                System.out.println("Igbo Kwenu!!!");
                break;
            case 2:
                System.out.println("Aboki na!!!");
                break;
            case 3:
                System.out.println("Omo Oduduwa!!!");
                break;
            case 4:
                System.out.println("Hello World");
                break;
            default:
                System.out.println("Reverse");
        }
    }

}
