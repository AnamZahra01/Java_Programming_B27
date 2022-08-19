package day10_if_statements;

import java.util.Scanner;

public class CampusTime {
/* By Saim
    PQ-03:  Create an int value for the time of the day. Use a 24 hour format use the given time of day to display a message
    hint: use seperate if statements
    	if the hours are from 6 - 11, print: Good morning
	    if the hours are from 12 - 16, print: Good evening
	    if the hours are from 17 - 23 or 0 - 5, print: Good night
 */
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a time from 0-23 in 24H format, where 0 is midnight");
    int time = input.nextInt();
    String message = ""; // declaring & assigning a String with value empty space "". Default starting value

    if (time >= 6 && time <= 11){
       message = time+ ":00 am, Good morning";
    } else if (time >= 12 && time <= 16){
        message = time+ ":00 pm, Good evening";
    } else if ((time >= 17 && time <= 23 )|| (time >=0 && time <= 5)){
        message = time+ ":00 pm, Good night";
    } else {
        message = time+ " is not in 24H range";
    }
    System.out.println( message);

}
}
