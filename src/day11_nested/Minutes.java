package day11_nested;

import java.util.Scanner;

/*
PQ-02:  Declare and assign a minutes variable use the minutes value to determine how much time is left in the soccer game. Use these ranges to determine the outputs:
	- any number less than 0 and more than 90 are not valid:
		when the minutes are less than 0:
			print: minutes cannot be a negative number
		when the minutes are more than 90:
			print: games cannot be longer than 90 minutes

	- when the minutes are between 90 - 75
		print: just getting started

	- when the minutes are between 74 - 60
		print: players are doing their best

	- when the minutes are between 59 - 30
		print: middle of the game is going great

	- when the minutes are between 29 - 0
		print: the end of the same is approaching
 */
public class Minutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter time: ");
        int minute = input.nextInt();

        if (minute >= 0 && minute <= 90){
            if (minute >= 75){
                System.out.println("Just getting started");
            } else if (minute >= 60) {
                System.out.println("Players are doing their best");
            } else if (minute >= 30) {
                System.out.println("Middle of the game is going great");
            } else if (minute < 30) {
                System.out.println("The end of the game is approaching");
            }

        } else {        // min < 0 or min > 90 Block
            if (minute < 0) {
                System.out.println(minute+ " -> Minutes can not be a negative number");
            } else {
                System.out.println(minute+ " -> Game can not be longer than 90 minutes");
            }
        }
// Ternary: System.out.println(minute < 0 ? "minutes can not be a negative number" : "games can not be longer than 90 minutes");

    }
}
