package day39_inheritance.employeePQ1;
//    Create a class Developer - Developer class inherits Employee class
public class Developer extends Employee{

    //	- create additional variables: features created
    boolean featuresCreated;
    public Developer(String name, boolean isFullTime, double salary, boolean featuresCreated) {
        super(name, isFullTime, salary);
        this.featuresCreated = featuresCreated;
    }

    //	- create method:  develop()
//    Example output: prints Creating more features
    public void develop(){
        System.out.println("Creating more features");
    }

    public String toString() {
        return "Developer{" +
                "featuresCreated=" + featuresCreated +
                ", name='" + name + '\'' +
                ", isFullTime=" + isFullTime +
                ", salary=" + salary +
                '}';
    }
}
