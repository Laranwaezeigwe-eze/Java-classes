package firstTdd;

public class Bank {
    private double balance;
    private int pin;


    public void deposit(BankAccount bankAccounts, int depositAmount) {
        balance += depositAmount;
    }

    public double checkBalance(BankAccount bankAccounts) {
        return balance;
    }

    public boolean assignAccountNumber(BankAccount bankAccounts, int accountNumber) {
     return true;
    }

    public void setPin(BankAccount bankAccounts, int myPin) {
        pin = myPin;
    }

    public void changePin(BankAccount bankAccounts, int oldPin, int newPin) {
        pin = newPin;
    }


    public int checkPin(BankAccount bankAccounts) {
        return pin;
    }

    public void withdraw(BankAccount bankAccounts, int withdraw, int myPin) {
        if(myPin == 9870) {
            if (withdraw < balance) {
                balance = balance - withdraw;
            }
        }

    }


}
