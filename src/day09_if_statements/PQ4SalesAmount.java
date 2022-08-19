package day09_if_statements;

import java.util.Scanner;
public class PQ4SalesAmount {

/*
PQ-04:  Create a sales amount variable use the sales amount to determine the bonus you get at end of the month
    	if your sales amount is less than 10000 you don't get any bonus
    	if your sales amount is more than or equal to 10000 and less than 15000 you get a bonus of 5000
    	if your sales amount is more than or equal to 15000 you get a bonus of 7000
    	print your bonus number
 */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter sales amount: ");
        int salesAmount = input.nextInt();
        int bonus = 0 ;

        if (salesAmount < 10000){
            bonus = salesAmount;
        }
        if (salesAmount >= 10_000 && salesAmount < 15_000){
            bonus = 5_000;
            bonus += salesAmount;
        }
        if (salesAmount >= 15_000){
            bonus = 7_000;
            bonus += salesAmount;
        }
            System.out.println( bonus );
    }
}
