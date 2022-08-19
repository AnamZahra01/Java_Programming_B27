package day12_switch;

import java.util.Scanner;

public class DaysInMonth {
    /*
    PQ-02:  Days In Month (slightly different version than before)
Write a program that will accept a month name and outputs how many days are in that month
data:
    February: 28 days
    April, June, September, November: 30 days
    January, March, May, July, August, October, December: 31 days
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month name: ");
        String month = input.next();
        int days = 0;

        switch (month) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                days = 31;
                break;

            case "February":
                days = 28;
                break;

            case "April":
            case "June":
            case "September":
            case "November":
                days = 30;
                break;

        }
      if (days > 0) { //switch: Strings --> gives output even on wrong input, so use if
          System.out.println(month + " --> Days : " + days);
      } else {
          System.out.println("Is " +month+ " a month name? Please Enter month name!!");
      }

    }
}