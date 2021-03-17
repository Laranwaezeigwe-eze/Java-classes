package chapterfive;

public class AtmMachine {
    private int pin;
    private double balance;

    public AtmMachine(int pin, double balance) {
        this.pin = pin;
        this.balance = balance;
    }

    public AtmMachine() {

    }

    public void setPin(int pin) {
        if (pin >= 0000 && pin <= 9999) {
            pin = this.pin;
        }else
            System.out.println("invalid pin");
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount, int pin) {
        if (amount >= 0) {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount, int pin) {
        if (pin == this.pin && amount > 0.0 && amount < balance){
            balance = balance - amount;}

        else if (balance < amount){
            System.out.println("insufficient balance");
        }
        else
            balance = balance - amount;
    }

    public void transfer(double amount, int pin) {
        if (pin == this.pin && amount > 0.0 && this.balance > amount) {
            balance = balance - amount;
        }
    }
}

