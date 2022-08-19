package day19_loops;

import java.util.Scanner;

public class ReversePQ5 {
    /*
    Reverse only second word

Given a String with three words separated by spaces. Reverse only the second word and return the modified String
	Ex:
	I love java
  //012345678910
	Ouput:
	I evol java

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();//"I love java";

        String reverse  = "";

        int spaceIndex1 = str.indexOf(" ");
        int spaceIndex2 = str.indexOf(" ", spaceIndex1+1);

        String secondWord = str.substring(spaceIndex1,spaceIndex2+1); // taking second word from str and storing in secondWord.
        for (int i = secondWord.length()-1 ; i >= 0; i-- ) {
            reverse += secondWord.charAt(i);
        }
        System.out.println(str.replace(secondWord, reverse)); // I evol java

    }
}
