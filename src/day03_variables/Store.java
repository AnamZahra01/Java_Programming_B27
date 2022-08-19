package day03_variables;

public class Store {
    public static void main(String[] args) {

        int numberOfItems = 1000;
        System.out.println(numberOfItems + " items in the store"); //+ shows concatenation. To combine 2 or more things together.
        numberOfItems = 700;
        System.out.println(numberOfItems + " left after the sale");

        int totalAfterShipment = numberOfItems + 5000;
        System.out.println("Total After Shipment ="  + totalAfterShipment );

        double totalCost = 1_000_000.99; //10,000,000.99 -> we might want to write it but commas are not valif for java syntax, so we can use underscore in numbers, to improve readability.
        System.out.println(totalCost);

        float f = 19.99F; //adding F/f tells the compiler its a float number. Good news is We don't use float a lot.
        System.out.println("Float is " + f);

        float f2 = 100; //100 is int by default and int is smaller than float.
        System.out.println(f2);

        long population = 8_000_000_000L; //adding l/L to the number will change the type from int (default ) to a long type.
        System.out.println(population);

        //something missing



    }
}
