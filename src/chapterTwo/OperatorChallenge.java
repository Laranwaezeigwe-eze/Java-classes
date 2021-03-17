package chapterTwo;

public class OperatorChallenge {
    public static void main(String[] args) {

        double firstNumber = 20.0;
        double secondNumber = 80.0;

        double sum = firstNumber + secondNumber;
        System.out.println("Result is : "+ sum);

        double multiply = sum * 100;
        System.out.println("Result is: "+ multiply);

        double remainder = multiply % 40.0;
        System.out.println("Modulus is: "+ remainder);

        boolean modulus = true;
        if(modulus){
            System.out.println("Remainder is true");
        }
        modulus = false;
        if (modulus){
            System.out.println("Remainder is false");
        }
        if (remainder != 0){
            System.out.println("Got some remainder");
        }

    }
}
