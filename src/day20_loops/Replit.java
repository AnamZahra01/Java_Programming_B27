package day20_loops;

import java.util.Scanner;

public class Replit {

    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES:
        Scanner scan = new Scanner(System.in);
        int inhabitants = 6;//scan.nextInt();
        //WRITE YOUR CODE HERE:

        String store = inhabitants + " ";

        // for (int i = 0; i <= inhabitants+1; i++) {
        for (int i = inhabitants; i > 0; i--) {
            inhabitants = inhabitants / 2;
            store += "\n" + inhabitants;

            }
            System.out.println(store);

        }
    }
