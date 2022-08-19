package day19_loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
       /*
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        */
        System.out.print("Enter a number: ");
        int num = new Scanner(System.in).nextInt(); //New Thing: just for 1 num,This Scanner is not reusable
        long factorial = 1;
        String msg = num + "! = ";

        for(int i = num; i > 0; i--){
            factorial *=  i;
            msg += i + " * ";
        }
        msg +=   "1 = " + factorial;
        System.out.println(factorial);
        System.out.println(msg);
    }
}
