package day41_exceptions.try_catch.bank;

public class BankRun {
    public static void main(String[] args) {

        Bank obj = new Bank();
        obj.balance = 3000;

        obj.withdraw(1000);
        System.out.println(obj.balance);

        obj.withdraw(2000);
        System.out.println(obj.balance);

        obj.withdraw(2000);


    }
}
