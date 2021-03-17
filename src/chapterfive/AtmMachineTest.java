package chapterfive;

import java.util.Scanner;

public class AtmMachineTest {

    public static void main(String[] args) {

        AtmMachine atmMachine = new AtmMachine();
        Scanner userInputCollector = new Scanner(System.in);
        System.out.println("Welcome To Mavens ATM \n Create new PIN: ");

        int pin = userInputCollector.nextInt();

        System.out.println("Enter new PIN: ");
        int userPin = userInputCollector.nextInt();

        if(userPin != pin) {
            System.out.println("invalid PIN, try again");
        }

        else{
            String promptMessage = """
                    -> Press 1 for Deposit.
                    -> Press 2 for Withdraw.
                    -> Press 3 for Check Balance.
                    -> Press 4 for Transfer.
                    -> Press 0 for End Transaction.
                    """;
            System.out.println(promptMessage);

            double deposit;
            double withdraw;
            double transfer;

            while(true) {
                int userInput = userInputCollector.nextInt();

                switch (userInput) {
                    case 1 -> {
                        System.out.println("Enter Deposit Amount");
                        deposit = userInputCollector.nextInt();
                        double currentBalance = atmMachine.getBalance();
                        atmMachine.deposit(deposit, pin);
                        double newBalance = atmMachine.getBalance();
                        if (newBalance != currentBalance) {
                            System.out.println("you have deposited " + deposit);
                            System.out.println("Account balance is " + atmMachine.getBalance());
                        } else {
                            System.out.println("Deposit unsuccessful");
                        }
                    }
                    case 2 -> {
                        System.out.println("Enter Withdrawal Amount");
                        withdraw = userInputCollector.nextInt();
                        atmMachine.withdraw(withdraw, pin);
                        System.out.println("amount to withdraw " + withdraw);
                        System.out.println("Current account balance is " + atmMachine.getBalance());
                    }
                    case 3 -> System.out.println("Account balance is " + atmMachine.getBalance());
                    case 4 -> {
                        System.out.println("Enter Transfer Amount");
                        transfer = userInputCollector.nextInt();
                        atmMachine.transfer(transfer, pin);
                        System.out.println("you have transferred " + transfer);
                        System.out.println("Account balance is " + atmMachine.getBalance());
                    }
                    case 0 -> {
                        System.out.println("Take your card \n\n Thank you");
                        return;
                    }
                    default -> System.out.println("Wrong Input");
                }
                System.out.println();
                System.out.println(promptMessage);
               // userInput++;
            }
        }



    }

}
