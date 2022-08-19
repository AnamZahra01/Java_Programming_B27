package day03_variables;
/*
PQ-3. Add a new class School
    add main method
    declare and assign all these variables:
    (all int) grade1, grade2, grade3, grade4, grade5
    assign the number of students in each grade
    extra: try to create another variable to find the total number of students in the whole school
    (all double) average gpa, number of school days, number of snow days
 */
public class School {
    public static void main(String[] args) {

        int grade1, grade2, grade3, grade4, grade5;
        grade1 = 24;
        grade2 = 20;
        grade3 = 19;
        grade4 = 21;
        grade5 = 22;

        int totalStudents;
        totalStudents = grade1 + grade2 + grade3 + grade4 + grade5 ;
        System.out.println("totalStudents = " + totalStudents);

        double averageGpa = 3.8, numberOfSchoolDays = 110.5, numberOffSnowDays = 3.5;
        System.out.println("averageGpa = " + averageGpa);
        System.out.println("numberOfSchoolDays = " + numberOfSchoolDays);
        System.out.println("numberOffSnowDays = " + numberOffSnowDays);

    }
}
