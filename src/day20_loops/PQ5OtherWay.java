package day20_loops;

import java.util.Scanner;

public class PQ5OtherWay {
     /*
    Biggest substring of matching characters
Given a String find the biggest substring of chars that match and print it.
    Ex:
        Input:  aaabbbcccccddddee
        Output:  ccccc
     */ // abcddeee gives wrong results
     public static void main(String[] args) {

             Scanner input = new Scanner(System.in);
             System.out.print("Enter a String: ");
             String str = "aaabbcddddee";// input.nextLine();  //"aaabbbbbbcccccddddddddee";
                        // 0123456789
        int length = 0;
         String subStr = "";

         for (int i = 0; i < str.length()-1 ; i++){


             if(str.charAt(i) != str.charAt(i+1)){ //index 2
                 subStr += str.charAt(i);
                 length = subStr.length();


             }
             subStr +=  str.charAt(i) ;
         }

         System.out.println(subStr);
         System.out.println(length);
     }
}
