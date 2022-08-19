package day22_array;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {

        // 1 -> January
        // 12 -> December

        Scanner input = new Scanner(System.in);

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August","September", "October", "November", "December" };
        System.out.print("Enter month number: ");
        int number = input.nextInt();

        if (number > 0 && number < 13){

            System.out.println(months[number - 1]);

        } else {
            System.out.println("Invalid month number. Should be 1 -12");
        }

    }
}
