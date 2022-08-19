package day16_string;

import java.util.Scanner;

public class PQ4 {
    /*
    [Relative checker]
Given two full names check if the two people are related. They will be considered to be related if they have the same last name
    Input:
        James Bond
        Jamie Bond
    Output:
        Related
    -------------------
    Input:
        James Bond
        Alex Benji
    Output:
        Not Related
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter full name1: ");
        String fullName1 = input.nextLine();
        System.out.print("Enter full name2: ");
        String fullName2 = input.nextLine();

        int indexOfSpace1 = fullName1.lastIndexOf(' ');
        String lastName = fullName1.substring(indexOfSpace1+1);


        if (fullName2.endsWith(lastName)){
            System.out.println("Related");
        } else {
            System.out.println("Not related");
        }

    }
}
