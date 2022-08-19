package day05_arithmetic_operators;
/*
 PQ-02:     create a class called KgTopounds, and write a program that can convert Kg to pound and print the result
            Ex:         kg = 10;
            output:     10 kg equal to 22.0462 pounds
                        kg = 20
            output:     20 kg equal to 44.0924 pounds
                .................................
            Hint: 1kg = 2.20462 pounds
 */

public class KgToPounds {
    public static void main(String[] args) {

        //declaring variables
        int val = 10;
        double constant = 2.20462;

        //formula: 1 kg = 2.20462 pounds
        double kgToPound = val * constant;
        System.out.println(val + " kg is equal to " + kgToPound + " pounds. ");

        //Re-assigning variables
        val = 20;
        kgToPound = val * constant ;
        System.out.println(val + " kg is equal to " + kgToPound + " pounds.");

    }
}
