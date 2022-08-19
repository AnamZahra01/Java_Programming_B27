package day09_if_statements;

import java.util.Scanner;

public class FunPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Object of Scanner Class
        String notHorse = "You are not a horse"; // notHorse variable;

        System.out.println("Are you a Horse? T/F"); // show message
        boolean isHorse =  input.nextBoolean();     //user input for T/F

        if (isHorse == true){                       // if you are a horse go in..., and ask about legs
            System.out.println("How many legs do you have? 2 0r 4");
            int legs = input.nextInt();             //user input about legs 2 or 4

            if (legs == 4){                         // if legs are 4, go in...
                System.out.println("Really? T/F");  //Ask t/f
                boolean have4Legs = input.nextBoolean(); //Store t/f in variable have4Legs

                if (have4Legs == true){                 //if user has 4 legs, go in...
                    System.out.println("Can you read and write? T/F"); //ask
                    boolean readWrite = input.nextBoolean();            //store t/f in readWrite variable

                    if (readWrite == true){             // if user can read/write, go in...
                        System.out.println(notHorse);   //print statement at top, under scanner object
                    } else{                             // if you can not read and write
                        System.out.println("Liar! You are reading this");  // print this
                        System.out.println(notHorse);               // print this too
                    }
                }

            } else {                               // legs == 2 then print notHorse
                System.out.println(notHorse);
            }

        } else {                                 // Are you a horse? false: print this
            System.out.println(notHorse);
        }

    }
}
