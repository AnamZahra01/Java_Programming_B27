package day05_arithmetic_operators;
/*
PQ-01:  Create a class AverageNumber, and write a program that will define 4 scores and find the average of the scores
 */

public class AverageNumber {
    public static void main(String[] args) {

        // defining scores
        double score1 = 99.50;
        double score2 = 97.25;
        double score3 = 70.75;
        double score4 = 89.00;

        //average of scores
        double averageScore = (score1 + score2 + score3 + score4) / 4 ;
        System.out.println("The average of scores is: " + averageScore);
    }
}
