package day19_loops;

import java.util.Scanner;

public class Color {
         /*
               write a program that will allow the user to select three colors for the painting. There needs to be 3 unique colors selected
     */
         public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
             int numOfColors = 0;
             String colors = " ";

             while (numOfColors < 3){
                 System.out.println("Enter the next color: ");
                 String inputColor = input.nextLine().toLowerCase();

                 if (!colors.contains(inputColor)){ //if color is unique
                     colors += " " + inputColor;
                     numOfColors++; // next counter
                 }
             }
             System.out.println(colors.trim());
         }
}
