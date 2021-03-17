package firstTdd;


import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner userInputCollector = new Scanner(System.in);
        String prompt  = """
                Hello User,
                Welcome to Lasu Calculator.
                -> Enter 1 for addition.
                -> Enter 2 for absolute subtraction.
                -> Enter 3 for multiplication.
                -> Enter 4 for division.
                """;
        System.out.println(prompt);
        int userChoice = userInputCollector.nextInt();
        System.out.println("Enter first Number");
        int firstNumber = userInputCollector.nextInt();
        System.out.println("Enter second Number");
        int secondNumber = userInputCollector.nextInt();
        switch (userChoice){
            case 1 -> {
                System.out.println(calculator.add(firstNumber, secondNumber));
            }
            case 2 -> {
                System.out.println(calculator.subtract(firstNumber, secondNumber));
            }
            case 3 -> {
                System.out.println(calculator.multiply(firstNumber, secondNumber));
            }
            case 4 -> {
                System.out.println(calculator.divide(firstNumber, secondNumber));
            }
           default -> System.out.println("Choose another number");
        }
    }

}
