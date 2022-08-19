package day35_custom_classes.employee;

public class Employee {
    String name, jobTitle;
    int iD, salary;

    public Employee( String name,String jobTitle,
    int iD, int salary){
         this.name = name;
         this.jobTitle = jobTitle;
         this.iD = iD;
         this.salary = salary;

         goToMeeting();
    }
    public void goToMeeting(){
        System.out.println(name + " is going to a meeting");
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
