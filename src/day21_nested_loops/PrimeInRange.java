package day21_nested_loops;

import day20_loops.Prime;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        /*PRime: only divisible by one and itself.
        Print prime numbers upto a certain number.
        * */

        Scanner input = new Scanner(System.in);
        System.out.print("What number do you want to go to?");
        int range = input.nextInt();

        for(int i = 2; i < range; i++){

            boolean isPrime = true;
            for (int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

//            System.out.println(isPrime? "Prime" : "Not Prime");
            if (isPrime){
                System.out.println("Prime: " + i);
            }
        }

    }
}
