package day35_custom_classes.employee;
/*
 create a class called Employee
        - data:     name, id, job title, salary
        - constructor - create a constructor that creates an Employee object with the name, id, job title, and salary
        - method:    goToMeeting()
                when this method is called print:
                    $name is going to a meeting
            toString()-     print all the employees information
    Create a separate class to create and test the Employee objects
 */
public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Meryiam Bibi" , "SDET" , 151234, 100_000);
        System.out.println(employee1);
        System.out.println();

        Employee employee2 = new Employee("Gazille" , "SDET" , 291247, 120_000);
        System.out.println(employee2);
    }
}
