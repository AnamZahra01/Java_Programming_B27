package day03_variables;
/*
Q5- ShoppingReceipt
    Create a class called ShoppingReceipt
    Create a main method
    Print the following:

    ****************************
        WELCOME TO THE STORE
    ****************************

    -------------------------

    Cake              $24
    Water             $3.99
    Apple Juice       $7.50
    Bread             $4.25

    -------------------------
    TOTAL AMOUNT:     $39.74
    TAX:              $3.90

    GRAND TOTAL:      $43.64
    -------------------------
    *******THANK YOU*********
    --------------------------
 */

public class ShoppingReceipt {
    public static void main(String[] args) {
        System.out.println("****************************\n\tWELCOME TO THE STORE\n****************************" );
        System.out.println("\n-------------------------\n");
        System.out.println("Cake\t\t\t$24\n" +
                "Water\t\t\t$3.99\n" +
                "Apple Juice\t\t$7.50\n" +
                "Bread\t\t\t$4.25");
        System.out.println("\n-------------------------\n" +
                "TOTAL AMOUNT:\t$39.74\n" +
                "TAX:\t\t\t$3.90");
        System.out.println("\nGRAND TOTAL:\t$43.64\n" +
                "--------------------------\n" +
                "*******THANK YOU*********\n" +
                "--------------------------");


    }
}
