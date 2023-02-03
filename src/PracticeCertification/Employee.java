package PracticeCertification;

public class Employee {
    String name;
    int age;
    double salary;
    static String location = "Alexandria";

    public Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    public void raiseSalary(){
        if(salary>5000) {
            salary = salary + 1000;
            System.out.println("salary = " + salary);
        }else {
            salary = salary+700;
            System.out.println("salary = " + salary);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
