package day07_scanner;
/*
Notes: Scanner is a CLASS that allows us to type values in console.
Get the idea of how to use information that comes outside the code.
 */

import java.util.Scanner; //we can auto-import it as well: syntax--> import packageName.className;
public class FirstScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);     //only one scanner in one file. name could be usually: input, scan, scanner, keyboard, key, in. This is scanner variable/ object.
        System.out.println("Please enter a number");
        int number = input.nextInt();        //syntax to call method: object.method();          . Run methods from objects i.e, nextLine()

        System.out.println("number = " + number);

    }
}
