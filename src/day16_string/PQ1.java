package day16_string;

import java.util.Scanner;

public class PQ1 {
    /*
    Given two words. Print the first word without its first character then print the second word without its last character.
    Input:
        apple
        banana
    Output:
        pple
        banan
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String word1 = input.next();
        System.out.print("Enter second word: ");
        String word2 = input.next();

        int len = word2.length();

        word1 = word1.substring(1);
        word2 = word2.substring(0,len-1);

        System.out.println(word1);
        System.out.println(word2);
    }
}
