package day15_string;

import java.util.Scanner;

public class ValidWebsite {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your website");
        String website = input.next();

        boolean validStart = website.startsWith("www.");
        boolean validEnd = website.endsWith(".com")||website.endsWith(".edu") || website.endsWith(".gov") || website.endsWith(".net");

        if (validStart && validEnd){
            System.out.println("Valid website");
        } else {
            System.out.println("Invalid website");
        }

        if(!validStart){
            System.out.println("Website should start with www.");
        }

        if(!validEnd){
            System.out.println("Website should end with .com or .edu or .gov or .net");
        }

    }
}
