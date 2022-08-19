package day11_nested;

import java.util.Scanner;

/*
PQ-01:  Create a class called GradeLevel, Given a number grade level
determine and print which school type someone is in.
grade level and types are:

	any number less than 1 or more than 18 is not valid
	1-5: Elementary school
	6-8: Middle school
	9-12: High school
	13-16: College
	17-18: Grad School
 */
public class GradeLevel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter grade level : ");
        int gradeLevel = input.nextByte();
//        int gradeLevel = 5;
        String school = " ";

        if (gradeLevel > 1 && gradeLevel <= 18 ){

            if (gradeLevel >= 17){
                school = "Grad School";
            } else if (gradeLevel >= 13){
                school = "College";
            }else if (gradeLevel >= 9){
                school = "High School";
            } else if (gradeLevel >= 6) {
                school = "Middle School";
            } else if (gradeLevel >= 1) {
                school = "Elementary School";
            }
            System.out.println("Grade " +gradeLevel+ " - " + school);

        } else {
            if (gradeLevel < 1){
                System.out.println(gradeLevel+ " is Invalid Number. Grade needs to be positive number");
            } else if (gradeLevel > 18){
                System.out.println(gradeLevel+ " is Invalid. Grade needs to be less than 18");
            }
        }

    }
}
