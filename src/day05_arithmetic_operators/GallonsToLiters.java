package day05_arithmetic_operators;

import javax.lang.model.SourceVersion;

/*
PQ-03:  Create a class called GalonsToLiters, and write a program that can convert the gallons to litters
            Ex:      gallon = 10;
                     output:  10 gallons equal to 37.8541 liters
                     gallon = 20
                     output:  20 gallons equal to 75.7082 liters
 */
public class GallonsToLiters {
    public static void main(String[] args) {

        //assigning variables
        int value = 10;
        double constant = 3.78541;

        //Using Hint: 1 Gallon = 3.785 Liters
        double gallonToLiters = value * constant ;
        String output = value + " gallons is equal to " + gallonToLiters + " liters."; //value stored in string variable, named output.
        System.out.println(output);
        
        //Reassigning variables
        value = 20;
        gallonToLiters = value * constant ;
        output = value + " gallons is equal to " + gallonToLiters + " liters.";
        System.out.println(output);
    }
}
