package office_hours_practice.constructor_intro.employee_database;

import office_hours_practice.constructor_intro.employee_database.Employee;
import office_hours_practice.constructor_intro.employee_database.EmployeeDatabase;

public class Test {
    public static void main(String[] args) {

        EmployeeDatabase database = new EmployeeDatabase();
        //to get all employees
        System.out.println(database.getAllEmployees());

        //to get 1 employee
        Employee employee4 = new Employee("Zagham", 005);
        database.addEmployee(employee4);
        System.out.println(database.getAllEmployees());

        Employee employee5 = new Employee("Adam", 006);
        database.addEmployee(employee5);
        System.out.println(database.getAllEmployees());

        database.deleteEmployee(006);
        System.out.println(database.getAllEmployees());

        System.out.println(database.getEmployeeWithID(005));

        Employee employee6 = new Employee("Asim",006);
        database.addEmployee(employee6); //imp : i always forget to add
        System.out.println(database.getAllEmployees());

        Employee employee7 = new Employee("Asim", 007);
        database.addEmployee(employee7);
        System.out.println(database.getAllEmployees());

        // database.deleteAll();
        //System.out.println(database.getAllEmployees());

        System.out.println(database.getEmployeesWithName("Asim"));


    }
}
