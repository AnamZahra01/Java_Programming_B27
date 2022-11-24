package by_rreze.week3;

public class PrimeNumbers {
    public static void primeNum(int num){
        boolean isPrime = true;
        if(num < 2){
            System.out.println("Not Prime number");
            System.exit(0);
        }
        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
            System.out.println(isPrime ? "Prime" : "Not PRime");
    }
    public static void main(String[] args) {
        primeNum(15);
    }
}
