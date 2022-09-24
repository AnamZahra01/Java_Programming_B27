package office_hours_practice.constructor_intro.employee_database;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeDatabase {
    static ArrayList<Employee> employees = new ArrayList<>(); //belongs to class, not object

    static {
        Employee employee1 = new Employee("Anam", 001);
        Employee employee2 = new Employee("Zainab", 002);
        Employee employee3 = new Employee("Madiha", 003);
        employees.addAll(Arrays.asList(employee1, employee2, employee3));
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void deleteEmployee(int id) {
        employees.removeIf(emp -> emp.id == id);
    }

    public ArrayList<Employee> getAllEmployees() {
        return employees;
    }

    //to get specific employee from database
    public Employee getEmployeeWithID(int id) {
        Employee result = null;
        for (Employee emp : employees) {
            if (emp.id == id) {
                result = emp;
            }
        }
        return result;
    }

    public void deleteAll() {
        employees.clear();
    }

    //get all employees with names starting with A


    public ArrayList<Employee> getEmployeesWithName(String name){
        ArrayList<Employee> result = new ArrayList<>();
        for(Employee emp: employees){
            if(emp.name.equals(name)){
                result.add(emp);
            }
        }
        return result;
    }





}


