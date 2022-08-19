package day36_custom_classes.employee;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("James Bond", "Spy", 007, 10_000_000);
        employee1.goToMeeting();
        System.out.println(employee1);

        Employee employee2 = new Employee("Ana", 9);
        System.out.println(employee2);

        Employee employee3 = new Employee("Saim");
        System.out.println(employee3);

        System.out.println("-------------------");

        EmployeeV2 employee11 = new EmployeeV2("James Bond", "Spy", 007, 10_000_000);
        System.out.println(employee11);

        EmployeeV2 employee21 = new EmployeeV2("Ana", 9);
        System.out.println(employee21);

        EmployeeV2 employee31 = new EmployeeV2("Saim");
        System.out.println(employee31);
        System.out.println();
        //for practice
        Employee[] arr = new Employee[3];
        arr[0] = employee1;
        arr[1] = employee2;
        arr[2] = employee3;
        System.out.println(Arrays.toString(arr));

        ArrayList<Employee> list = new ArrayList<>();
    }
}
