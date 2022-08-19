package day16_string;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {

        // saim@cydeo.com= seperate saim and cydeo

        String email = "saim@cydeo.com";

        String name = email.substring(0,4);
        String domain = email.substring(5,10);
        System.out.println(name);
        System.out.println(domain);

        System.out.println("------------------------");
        System.out.println("Making Program Dynamic");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email1 = input.next();                       //"saim@cydeo.com";
        int indexOfAt = email1.indexOf('@');
        String name1 = email1.substring(0,indexOfAt);
        int indexOfDot = email1.indexOf('.');
        String domain1 = email.substring(indexOfAt+1, indexOfDot);
        System.out.println("Name: " + name1 + "\nDomain: " +domain1);

        boolean val = email.substring(0,3).contains("java");
        System.out.println(val);
    }
}
