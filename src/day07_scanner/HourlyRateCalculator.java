package day07_scanner;
/*
PQ-05:  Create a program that will ask the user to enter a salary(double) and number of hours(int). Calculate the         hourly rate.      Hint:hourly rate = salary / (hours weekly * 52)
 */
import java.util.Scanner;
public class HourlyRateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter salary: ");
        double salary = input.nextDouble();

        System.out.println("Enter number of hours: ");
        int hours = input.nextInt();

        double hourlyRate = salary / (hours * 52);
        System.out.println("Hourly Rate = " + hourlyRate);

    }
}
