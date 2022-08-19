package day36_custom_classes;

public class Offer {

    String company;
    String location;
    double salary;
    boolean isFullTime;
    int numberOfPto;

    public Offer(String company, String location) {
        this.company = company;
        this.location = location;
    }

    public Offer(String company, String location, double salary) {
        this(company,location);
        this.salary = salary;
    }

    public Offer(String company, String location, double salary, boolean isFullTime, int numberOfPto) {
        this(company,location,salary);
        this.isFullTime = isFullTime;
        this.numberOfPto = numberOfPto;
    }

    public String toString() {
        return "\nOffer{" +
                "company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", numberOfPto=" + numberOfPto +
                '}';
    }
}
