package PracticeCertification.Practice2;

public class Bank {
    private String owner;
    private double balance;
    public Bank(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void getWithdraw(double balance){
       if(balance <= this.balance){
           double remainingBalance = this.balance - balance;
           System.out.println("Amount withDrawn: " + balance + "\n" + "Amount Left: " +remainingBalance );

       }else {
           System.out.println("You dont have enough balance to withdraw");
       }
    }

    public void setDeposit(double balance){
        if(balance > 0) {
            this.balance += balance;
        } else {
            System.out.println("Enter positive value");
        }
    }

}
