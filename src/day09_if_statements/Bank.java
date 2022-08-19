package day09_if_statements;

public class Bank {
    public static void main(String[] args) {

        double balance = 1_000_000;
        double amountToWithdraw = 500_000;

        balance -= amountToWithdraw; //balance = balance - amountToWithdraw;
        System.out.println("amountToWithdraw = " + amountToWithdraw);

        if (balance < 0){
            System.out.println("Overdraft penalty");
            System.out.println("amount due: " + amountToWithdraw * 0.25);
        }
        if(balance >= 0){
            System.out.println("Account balance is: " +balance);
        }

    }
}
