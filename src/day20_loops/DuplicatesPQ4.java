package day20_loops;

import java.util.Scanner;

public class DuplicatesPQ4 {
    /*
    Remove Duplicates
    Write a program that can remove duplicates from a String
        Ex:
            Input: abcdabc
            Output: abc
            ALGO:
            1. take 1st char letter -> compare it with the whole String
            2. take 2nd char letter -> compare it with the whole String
                  [i = 0;  a == str.charAt(0+1) -> a == str.charAt(1) -> a == b;
                  i = 1; a == str.charAt(1+1) -> a == str.charAt(2) -> a == c;
                  i = 2; a == str.charAt(2+1) -> a == str.charAt(3) -> a == d;
                  i = 3; a == str.charAt(3+1) -> a == str.charAt(4) -> a == a;]
                  -> NOTE: does not work because replace takes Strings only, not char.
            ALGO 2:
            1. take 1st substring letter -> compare it with the whole String
            2. take 2nd substring letter -> compare it with the whole String
                  i = 0;  a == str.substring(i+1, i+2) -> a == str.substring(1,2) -> a == b;
                  i = 1;  a == str.substring(1+1, 1+2) -> a == str.substring(2,3) -> a == c;
                  i = 2;  a == str.substring(2+1, 2+2) -> a == str.substring(3,4) -> a == d;
                  i = 3;  a == str.substring(3+1, 3+2) -> a == str.substring(4,5) -> a == a;

ALGO:
for( whole string)
if (substring(0,1).= substring(1))
remove(0,1)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String str = input.nextLine(); // "abbcabcd";

        for (int i = 0; i < str.length() - 1 ; i++) {
        if (str.substring(i + 1).contains(str.substring(i, i + 1))) {
            str =  str.replaceFirst(str.substring(i, i + 1), "");
          i--;
              }
        }
     System.out.println(str);
    }
}

