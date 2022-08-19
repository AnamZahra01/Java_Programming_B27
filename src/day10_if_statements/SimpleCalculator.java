package day10_if_statements;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        int numOne = 10;
        int numTwo = 5;
        char operator = '+';
        double result=0;

        if (operator == '+'){
            result = numOne + numTwo;
        } else if (operator == '-') {
            result = numOne - numTwo;
        } else if (operator == '*' || operator == 'x') {
            result = numOne * numTwo;
        } else if (operator == '/') {
            result = numOne / numTwo;
        } else if (operator == '%') {
            result = numOne % numTwo;
        } else {
            System.out.println("Invalid Operator");
        }
        System.out.println(numOne+ " " +operator+ " "+numTwo+ " = " + result);

    }
}
