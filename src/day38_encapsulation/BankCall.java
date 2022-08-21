package day38_encapsulation;

public class BankCall {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(21546897L,782725 );
        System.out.println(account1.getAccountNumber());
        System.out.println(account1.getBalance());
    }
}
