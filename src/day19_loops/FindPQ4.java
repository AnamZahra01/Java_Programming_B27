package day19_loops;

import java.util.Scanner;

public class FindPQ4 {
    /*
    Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
	Ex:
		Input:
			2juMp41EEkd4s4
		Output:
			3 uppercase letters
			6 lowercase letters
			5 numbers
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String word = input.next();                     //"2juMp41EEkd4s4";
        int countLowerCase = 0;
        int countUpperCase = 0;
        int countNumbers = 0;

        for(int i = 0; i < word.length(); i++){
            if ((word.charAt(i) >= 'a') &&  (word.charAt(i) <= 'z')){
                countLowerCase++;
            } else if ((word.charAt(i) >= 'A') &&  (word.charAt(i) <= 'Z')){
                countUpperCase++;
            }else if ((word.charAt(i) >= '0') &&  (word.charAt(i) <= '9')){
                countNumbers++;
            }
        }
        System.out.println("Lower Case: " + countLowerCase);
        System.out.println("Upper Case: " + countUpperCase);
        System.out.println("Numbers: " + countNumbers);

    }
}
