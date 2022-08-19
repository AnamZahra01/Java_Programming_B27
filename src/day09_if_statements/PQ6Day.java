package day09_if_statements;

import java.util.Scanner;

/*
PQ-06:  Create a number to represent the day. (1 being Monday and 7 being Sunday)
        Print the day related to the number
    	Ex:	2
		    Tuesday
    	Ex: 5
		    Friday
 */
public class PQ6Day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number from 1 _ 7");
        int number = input.nextInt();

        if (number == 1){
            System.out.println("Monday");
        }
        if (number == 2){
            System.out.println("Tuesday");
        }
        if (number == 3){
            System.out.println("Wednesday");
        }
        if (number == 4){
            System.out.println("Thursday");
        }
        if (number == 5){
            System.out.println("Friday");
        }
        if (number == 6){
            System.out.println("Saturday");
        }
        if (number == 7){
            System.out.println("Sunday");
        }

    }
}
