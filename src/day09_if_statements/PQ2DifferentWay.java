package day09_if_statements;

import java.util.Scanner;

/*
PQ-02:  Create three number variables. Find and print which number is bigger between the three
    	ex:
	    	50
		    45
		    100
		output:
		100 is the biggest
 */
public class PQ2DifferentWay {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String output = "";
        System.out.println("Enter three number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                output += num1 + " is the biggest";
            } else { // (num1 < num3)
                output += num3 + " is the biggest";
            }
        } else {       // (num1 < num2)
            if (num3 > num2) {
                output += num3 + " is the biggest";
            } else {    // (num2 > num3)
                output += num2 + " is the biggest";
            }
        }
        System.out.println(output);

    }
        }