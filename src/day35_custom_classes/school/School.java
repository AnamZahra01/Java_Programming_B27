package day35_custom_classes.school;

public class School {

    String name;
    int totalNumOfStudents;
    double avgGpa;

//    public School(String  nameIn, int totalNumOfStudentsIn, double avgGpaIn){
//        name = nameIn;
//        totalNumOfStudents = totalNumOfStudentsIn;
//        avgGpa = avgGpaIn;
//    }

    public School(String name, int totalNumOfStudents, double avgGpa){
        this.name = name;
        this.totalNumOfStudents = totalNumOfStudents;
        this.avgGpa = avgGpa;
    }

    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", totalNumOfStudents=" + totalNumOfStudents +
                ", avgGpa=" + avgGpa +
                '}';
    }
}
/*
Note:As Java prioritise local variable, not instance variables -> need to introduce this
 */

