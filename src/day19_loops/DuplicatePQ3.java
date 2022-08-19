package day19_loops;

import java.util.Scanner;

public class DuplicatePQ3 {
    /*
    Multiply End
Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times
	Ex:
		Input:
			Hello?
			3
		Output:
			Hello????
	Ex:
		Input:
			java
			5
		Output:
			javaaaaaa
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.next();
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = 0; i < number; i++){ // 0,1,2,3,4
            word = word + word.charAt(word.length()-1);
        }
        System.out.println(word );



    }
}
