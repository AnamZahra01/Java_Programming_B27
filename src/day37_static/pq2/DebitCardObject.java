package day37_static.pq2;

public class DebitCardObject {
    public static void main(String[] args) {

        //        Create a constructor that will create a debit card object and initialize the card number, the card holder name, and the balance.

       DebitCard obj1 = new DebitCard(1234567891011234L, "Baz M", 10_000); //obj
        System.out.println(obj1);
        System.out.println(DebitCard.accountType);
        System.out.println();

        DebitCard obj2 = new DebitCard(1234, "Olper", "Master", 1234, 5000);
        System.out.println(obj2);
        System.out.println(DebitCard.accountType);
        System.out.println();

        DebitCard obj3 = new DebitCard(1234234534564567L, "Olper", "Visa", 12345, 5000);
        System.out.println(obj3);
        System.out.println(DebitCard.accountType);


    }
}
/*
parseInt: converts String -> int
valueOf: converts int -> String
Integer is object type: used with arrayList only
 */