package chapterThree;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name = name;
        if(balance>0.0)
        this.balance = balance;
    }
    public void deposit(double depositAmount){
        if(depositAmount >0.0)
            balance = balance + depositAmount;
    }
    public void withdraw(double withdrawAmount){
        if(withdrawAmount<balance)
            balance = balance-withdrawAmount;
        else if(withdrawAmount > balance){
            System.out.println("Withdraw amount exceeds account balance.");
        }
    }
        public void excesswithdraw(double withdrawAmount){
        if (balance< withdrawAmount)
            balance = balance-withdrawAmount;
        }
        public double getBalance(){
        return balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
