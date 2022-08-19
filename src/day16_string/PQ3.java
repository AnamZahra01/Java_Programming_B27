package day16_string;

import java.util.Scanner;

public class PQ3 {
    /*
[Creating an email]
Ask user to enter two strings. Both strings should be at least 6 character long. If they are shorter than that print “Invalid data” and program should end.

If the information provided is valid, you will take the first 4 characters of first string and combine them with the last three characters of the second string. At the end of your combined string add “@cydeo.com” and print the final string as your created email.
The final email should be in all lowercase.

    input:
        JamesBond
        Secret
    output:
        jameret@cydeo.com
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String str1 = input.next().toLowerCase();
        System.out.print("Enter second word: ");
        String str2 = input.next().toLowerCase();

        int len1 = str1.length();
        int len2 = str2.length();
        String end = "@cydeo.com";

        if(len1 >= 6 && len2 >= 6){
            String newStr = "" + str1.substring(0,4) + str2.substring(len2-3, len2) + end;
            System.out.println(newStr);
        }else{
            System.out.println("Invalid data");
        }

    }
}
