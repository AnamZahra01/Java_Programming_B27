package day23_array;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 15 to see the number in word format ");
        int num = input.nextInt();

        String [] numWords = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen"};

        if(num >= 0 && num <= 15){
            System.out.println(numWords[num]);
        } else {
            System.out.println("Invalid number. Range is 0 - 15");
        }

    }
}
