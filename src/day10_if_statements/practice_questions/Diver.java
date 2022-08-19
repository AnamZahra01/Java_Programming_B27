package day10_if_statements.practice_questions;

import java.util.Scanner;

public class Diver {
    /*
   PQ-02:    Create a class Diver. You are diving in the ocean. Your oxygen tank has a certain level (number)
declare and assign an int variable about the oxygen level in the tank and print a message based on the oxygen level:
    Above 90 - Your tank is full
    Above 80 - Still okay
   	Above 70 - Don't go too far
   	Above 60 - Start to head back
    Above 50 - Be careful now you at at 50%
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int oxygenLevel = input.nextInt();
        String output = " " ;                                   //use String message; with else .

        //Multi level if statements
        if (oxygenLevel >= 90){
            output = "Your tank is full";
        } else if (oxygenLevel >= 80) {
            output = "Still okay";
        } else if (oxygenLevel >= 70) {
            output = "Don't go too far";
        } else if (oxygenLevel >= 60) {
            output = "Start to head back";
        } else if (oxygenLevel >= 50) {
            output = "Be careful now you at 50%";
        }

        System.out.println(output);
    }
}
