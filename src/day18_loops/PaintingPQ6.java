package day18_loops;

import java.util.Scanner;

public class PaintingPQ6 {
    /*
               write a program that will allow the user to select three colors for the painting. There needs to be 3 unique colors selected
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String colorsSelected = "";
        int counter = 0;
        while (counter < 3) {

            System.out.print("Enter a color: ");
            String color = input.nextLine();

            if (colorsSelected.contains(color)) {       //red == red; true
                System.out.println("Already selected!! Select unique color.");
                counter--;                             // if duplicate, get one more chance to select colour
            } else{                                    //(!(colorsSelected.contains(color)))
               colorsSelected += "\n" + (counter+1) + "- " + color ;
            }
            counter++;
        }
       System.out.println("Your Unique colours: " +colorsSelected );

    }
}
