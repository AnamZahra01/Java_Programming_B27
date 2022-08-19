package day20_loops;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter multiple words:");
        String str = input.nextLine().toLowerCase();//"Today is SUNDAY";

        String camelCase = "";

        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                camelCase += str.substring(i+1, i+2).toUpperCase(); // gives 1 char after space
               // char with uppercase: ("" + ste.charAt(i+1).toUpperCase);
                i++;                                                // go up by one

            } else {
                camelCase += str.charAt(i);
            }
        }

        System.out.println(camelCase);
    }
}
