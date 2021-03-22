package chapterThree;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("Dele",2000.00);

        System.out.printf("Account name is: %s%nInitial account balance is: %.2f%n",account.getName(),account.getBalance());
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");

        double depositAmount = input.nextDouble();
        account.deposit(depositAmount);
        System.out.printf("New account balance is: %.2f%n",account.getBalance());

        System.out.print("Enter amount to withdraw: ");

        double withdrawAmount = input.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.printf("Balance after Withdraw is: %.2f%n", account.getBalance());


        }
    }

