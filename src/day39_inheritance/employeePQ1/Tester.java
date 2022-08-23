package day39_inheritance.employeePQ1;

// Create a class Tester - Tester class inherits Employee class
public class Tester extends Employee {

//	- create additional variables:  bugs found
    boolean bugsFound;

    public Tester(String name, boolean isFullTime, double salary, boolean bugsFound) {
        super(name, isFullTime, salary);
        this.bugsFound = bugsFound;
    }

    //	- create method: test() -> Example output: prints Running the regression
    public void test(){
        System.out.println("Running the Regression");
    }

    public String toString() {
        return "Tester{" +
                "bugsFound=" + bugsFound +
                ", name='" + name + '\'' +
                ", isFullTime=" + isFullTime +
                ", salary=" + salary +
                '}';
    }
}
