package day09_if_statements;

import java.util.Scanner;

/*
PQ-03:  Create an int value for the time of the day. Use a 24 hour format use the given time of day to display a message
        hint: use seperate if statements
    	if the hours are from 6 - 11, print: Good morning
	    if the hours are from 12 - 16, print: Good evening
	    if the hours are from 17 - 23 or 0 - 5, print: Good night
 */
public class PQ3TimeOftheDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter time:  ");
        int hour = input.nextInt();

         if (hour >= 6 && hour <= 11){
             System.out.println(hour+ ":00 am, Good morning");
         }
         if (hour >= 12 && hour <= 16){
             System.out.println(hour+ ":00 pm, Good evening");
         }
        if (hour >= 17 && hour <= 23 || hour >=0 && hour <= 5){
            System.out.println(hour+ ":00 pm, Good night");
        }

    }
}
