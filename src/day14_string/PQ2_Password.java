package day14_string;

import java.util.Scanner;

public class PQ2_Password {
    /*
    PQ-02:  Declare and assign a String for password
            the password should be more than 8 character long
            print: Valid password or Invalid password
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String userPassword = input.next();

        if (userPassword.equals("Cydeo121$")){
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

    }
}
