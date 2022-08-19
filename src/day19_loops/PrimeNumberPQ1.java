package day19_loops;

import java.util.Scanner;
/*
Prime numbers: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
 */
public class PrimeNumberPQ1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int value = 0;
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
            count++;
            }
        }
       if (count == 2){
           System.out.println("Prime Number");
       } else {
           System.out.println("Not Prime Number");
       }

        }
}

