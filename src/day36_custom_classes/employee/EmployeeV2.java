package day36_custom_classes.employee;

public class EmployeeV2 {

        String name, jobTitle;
        long iD;
        double salary;

    public EmployeeV2(String name) {
        this.name = name;
    }

    public EmployeeV2(String name, long iD) {
        this(name);
        this.iD = iD;
    }

    public EmployeeV2(String name, String jobTitle, long iD) {
        this(name , iD);
        this.jobTitle = jobTitle;
    }

    public EmployeeV2(String name, String jobTitle, long iD, double salary) {
        this(name, jobTitle, iD);
        this.salary = salary;
    }

    // Constructor chaining -> constructor calling other constructor


    public String toString(){

        String output = "Name: " + name;

        if(iD != 0){
            output += ", ID: " +iD;
        }
        if(jobTitle != null){
            output += ", Job Title: " + jobTitle;
        }

        if(salary != 0){
            output += ", Salary: " +salary;
        }
        return output;
    }
}
