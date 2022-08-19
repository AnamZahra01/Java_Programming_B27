package day16_string;

import java.util.Scanner;

public class ReplitExample {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next(); //appla
        int n = scan.nextInt(); //1

        //WRITE YOUR CODE BELOW
       boolean value = false;
        if (n == 1){

            value = str.substring(1).contains(str.substring(0,1)); //ppla contains a

        } else if(n == 2){

            value = str.substring(2).contains(str.substring(0,2));

        } else if(n == 3){

            value = str.substring(3).contains(str.substring(0,3));

        }
        System.out.println(value);

    }
}
