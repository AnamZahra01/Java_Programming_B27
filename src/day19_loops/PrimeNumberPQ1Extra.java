package day19_loops;

public class PrimeNumberPQ1Extra {
    /*
    Prime number
    Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.
Ex:
	Input:
		11
	Output:
		prime
Ex:
	Input:
		10
	Output:
		not prime

     */
    public static void main(String[] args) {

        int num = 11;
        int value ;
        String remainderValue = "";

        for (int i = 2; i < num; i++) {
            value = num % i;
            remainderValue += value;
        }

        if(remainderValue.contains("0")){
            System.out.println("Not Prime");
        }else {
            System.out.println("Prime Number");
        }

    }
}
