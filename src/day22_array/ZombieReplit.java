package day22_array;

import java.util.Scanner;

public class ZombieReplit {

        public static void main(String[] args) {
            //DO NOT TOUCH THESE LINES:
            Scanner scan = new Scanner(System.in);
            int inhabitants = scan.nextInt();
            //WRITE YOUR CODE HERE:

            String caseNumber = "";

            for (int i = 0;  inhabitants >= 1 ;i++ ) {

                caseNumber = "Day " + i + " [" + inhabitants + "]";
                inhabitants /= 2;
                System.out.println(caseNumber);
            }
            System.out.println("---- EXTINCT ----");
        }
    }


