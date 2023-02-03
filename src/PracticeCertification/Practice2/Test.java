package PracticeCertification.Practice2;

public class Test {

    public static void main(String[] args) {

        Bank obj1 = new Bank("Baz", 10000.0);

       obj1.getWithdraw(2000);

       obj1.setDeposit(4000);

        System.out.println(obj1.getBalance());
    }
}
