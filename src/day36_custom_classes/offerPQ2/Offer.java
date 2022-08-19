package day36_custom_classes.offerPQ2;

//create a class called Offer
public class Offer {

    // - data:  company, location, salary, is full time, number of PTO

    String company;
    String location;
    double salary;
    boolean isFullTime;
    int numOfPTO;

//  - constructor  - create a constructor that creates an Offer object with the company and location

    public Offer(String company, String location) {
        this.company = company;
        this.location = location;
    }

//  - create a constructor that creates an Offer object with the company, location, and salary

    public Offer(String company, String location, double salary) {
        this.company = company;
        this.location = location;
        this.salary = salary;
    }

//   - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO

    public Offer(String company, String location, double salary, boolean isFullTime, int numOfPTO) {
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numOfPTO = numOfPTO;
    }

//        - method:  toString()  print all the employee's information

    public String toString() {
        return "Offer{" +
                "company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", numOfPTO=" + numOfPTO +
                '}';
    }
}
