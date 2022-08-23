package day39_inheritance.employeePQ1;
//    Create a Employee class
public class Employee {
//	- create variables: name, is full time, salary
    String name;
    boolean isFullTime;
    double salary;

    public Employee(String name, boolean isFullTime, double salary) {
        this.name = name;
        this.isFullTime = isFullTime;
        this.salary = salary;
    }

    //	- create method: work()- Example output: prints $name is working
    public void work(){
        System.out.println(name + " is working");
    }

}
