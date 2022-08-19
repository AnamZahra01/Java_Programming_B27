package day24_array;

import java.util.Arrays;
import java.util.Scanner;

public class ReorderPQ6 {
    /*
    Given two Strings determine if they are anagram or not. Anagram is when the character of the words can be reordered to get a different word
Ex:
  listen
  silent
The letters of the two words are the same so they are anagram
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String word1 = input.next();
        System.out.print("Enter second word: ");
        String word2 = input.next();

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

    }
}
