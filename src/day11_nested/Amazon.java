package day11_nested;

public class Amazon {
    public static void main(String[] args) {

        double price = 100.99;
        boolean isPrime = false;

        if(isPrime){
            System.out.println("Free 2 day shipping");
        } else { //notPrime
            if (price >= 25) {
                System.out.println("Free Shipping available");
            } else {
                System.out.println("Shipping cost is 2.99$");
            }
        }

    }
}
