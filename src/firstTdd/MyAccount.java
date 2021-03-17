package firstTdd;

public class MyAccount {
    private double balance;
    private int pin;


    public void deposit(double amount) {
        if (amount >= 0) {
            balance = balance + amount;
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setPin(int newPin) {
         pin = newPin;
    }

    public void withdrawMoney(double amountToWithdraw, int pin) {
        if (pin == this.pin) {
            balance = balance - amountToWithdraw;
        }

    }
}