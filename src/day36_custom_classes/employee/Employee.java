package day36_custom_classes.employee;

public class Employee {
    String name, jobTitle;
    long iD;
    double salary;

    public Employee(String name, long iD) {
        this.name = name;
        this.iD = iD;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String jobTitle, long iD, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.iD = iD;
        this.salary = salary;
    }

    public void goToMeeting(){
        System.out.println(name+ " is going to a meeting");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", iD=" + iD +
                ", salary=" + salary +
                '}';
    }
}
