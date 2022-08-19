package day10_if_statements.practice_questions;

import java.util.Scanner;

public class RaTake {
    /*
 PQ-03:   Create a class Retake declare and assign a grade variable declare and assign an attempt number
          Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:
                If its the first attempt -> subtract 10%
                If its the second attempt -> subtract 20%
                If its the third attempt -> subtract 35%
           Based on the retake attempt number calculate the final grade
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the grade: ");
        double grade = input.nextDouble();

        System.out.println("Attempt 1,2 or 3? ");
        int attempt = input.nextInt();

        if (attempt == 1){
            grade = grade - (grade * 0.1);
        } else if (attempt == 2) {
            grade = grade - (grade * 0.2);
        } else if (attempt == 3){
            grade = grade - (grade * 0.35);
        }
        System.out.println("Final Graade: " +grade);

    }
}
