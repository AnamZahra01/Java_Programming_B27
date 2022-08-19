package day08_scanner;
/*  Question: Go to replit.com --> 1-Variable & Scanner --> [A] Seconds Converter
Q.  Write a program that will take a number of seconds and converts it to a number of hours, minutes and seconds
                Ex:     Enter seconds:
                        3695
                        1 hours, 1 minutes, and 35 seconds
 */
// hard code program for understanding:
public class Time {
    public static void main(String[] args) {  // main Class (we already knew this part)
        int givenSec = 3700;
        int hours = givenSec / 3600;            // (3700 / 3600) = 1 hour
        int min = givenSec % 3600 /60 ;         // 3700 % 3600 = 100 --> 100 / 60 = 1 min
        int sec = givenSec % 3600 % 60;         // 3700 % 3600 = 100 --> 100 % 60 = 40 sec

        System.out.println("hours = " + hours);
        System.out.println("min = " + min);
        System.out.println("sec = " + sec);
    }
}
