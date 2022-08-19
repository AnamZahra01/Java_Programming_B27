package day03_variables;
/*
PQ1- Add a new class WatchInfo
    add main method
    declare and assign all these variables:
    yearsOfWarranty(int), price(double), waterResistant(boolean), isSmart(boolean)
    print the variables
 */
public class WatchInfo {
    public static void main(String[] args) {
        int yearsOfWarranty = 20;
        double price = 10_000.99;
        boolean isWaterResistant = true;
        boolean isSmart = false;

        System.out.println("Int value of yearsOfWarranty is = " + yearsOfWarranty);
        System.out.println("Double value of price is =  " + price);
        System.out.println("The boolean value is = " + isWaterResistant);
        System.out.println("The other boolean value is = " + isSmart);
    }

}
