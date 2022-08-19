package day08_scanner;
/*
Dynamic information using Scanner, not hard code
full name
job title
salary --> ask for hourly rates and weekly hours and calculate salary using salary = hourlyRate * (hoursWeekly*52)
company hq
full time
 */

import java.util.Scanner;

public class EmployeeReport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your job title");
        String jobTitle = input.nextLine();

        System.out.println("What is your hourly rate");
        double hourlyRate = input.nextDouble();
        System.out.println("What is average number of hours a week");
        int hours = input.nextInt();
        double salary = hourlyRate * hours * 52; // 52 weeks a year

        input.nextLine();                                                           //nextLine() needs VIP treatment
        System.out.println("Where is the company HQ");
        String hQ = input.nextLine();

        System.out.println("Are you full time: true or false");
        boolean isFullTime = input.nextBoolean();

        String report = fullName + " is a " + jobTitle + " they make " +salary+ " because they are full time " +isFullTime+ ". The HQ is located in " +hQ;
        System.out.println(report);
    }
}
