package day09_if_statements;

/* By Saim
PQ-05:  Create a char variable letter. Find and print if the character is a letter, number, or special character
	ex: p
		letter
	ex: 6
		number
	ex: $
		speical character
 */
//boolean improves readability of your code
public class PQ5LetterOtherWay {
    public static void main(String[] args) {

        char letter = '~';

        boolean isLetter = (letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z' );
        boolean isNumber = letter >='0' && letter <= '9';

        if (isLetter){
            System.out.println(letter+ " is a Letter");
        }

        if (isNumber){
            System.out.println(letter+ " is a Number");
        }

        if (!isLetter  && !isNumber){
           System.out.println(letter+ " is Special Character");
        }

    }
}
