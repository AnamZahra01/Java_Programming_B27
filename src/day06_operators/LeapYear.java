package day06_operators;
/*
PQ-04.  Create a class LeapYear
        declare and assign a year variable
        check if the year is a leap year, a year will be a leap year if it is divisible by 4
 */
public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;        // declaration
        boolean isLeapYear = (year % 4 == 0);

        System.out.println(year +" is Leap Year: " + isLeapYear);

    }
}
