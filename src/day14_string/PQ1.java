package day14_string;

import java.util.Scanner;

public class PQ1 {
    /*
    PQ-01:  Declare and assign a String
        print the String in all uppercase format and
        print the String in all lowercase format
     */

    public static void main(String[] args) {
       // String name = "You never really learn much from hearing yourself speak";

//        String name1 = name.toUpperCase(); //Assigning variable
//        System.out.println(name1);

//        name = name.toUpperCase(); //Reassigning name variable
//        System.out.println(name);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String name = input.nextLine();

        System.out.println("UPPERCASE: " + name.toUpperCase());
        System.out.println("ORIGINAL: " + name);

        System.out.println("lowercase: " + name.toLowerCase());
        System.out.println("original: " + name);

    }
}
