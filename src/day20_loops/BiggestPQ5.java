package day20_loops;

import java.util.Scanner;

public class BiggestPQ5 {
    /*
    Biggest substring of matching characters
Given a String find the biggest substring of chars that match and print it.
    Ex:
        Input:  aaabbbcccccddddee
        Output:  ccccc
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = input.nextLine();  //"aaabbbbbbcccccddddddddee";
// abcddeee gives wrong results
        String repeatedChar = "";
        int length = 0;
        int count = 1;
        for (int i = 0; i < str.length()-1 ; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }
            if (str.charAt(i) != str.charAt(i+1) || (i == str.length()-2 )) {
                if (count > length) {
                    length = count;
                    repeatedChar ="" + str.charAt(i);
                }
                count = 1;
            }
        }
        String output = "";
        for (int j = 0; j < length ; j++){
            output +=  repeatedChar;
        }
        System.out.println(output);
    }
}
