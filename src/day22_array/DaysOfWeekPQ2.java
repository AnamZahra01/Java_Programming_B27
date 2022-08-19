package day22_array;

import java.util.Scanner;

public class DaysOfWeekPQ2 {
    /*
    Create a program that will ask the user to enter a number for the day of the week. Print the day of the week based on:

    1 - Monday
    2 - Tuesday
    ...
    7 - Sunday

Use array, not if statement or switch
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday" };

        String output = days[number - 1];
        System.out.println(output);
    }
}
