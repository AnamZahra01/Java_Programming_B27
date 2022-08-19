package day05_arithmetic_operators;

public class Number {
    public static void main(String[] args) {
        //int number = -2;
        int number = 2;
        //int number = 0;

        boolean isPositive= number > 0 ;
        boolean isNegative= number < 0;
        boolean isZero = number == 0;

        System.out.println(number+" is Positive = " + isPositive);
        System.out.println(number+" is Negative = " + isNegative);
        System.out.println(number+" is Zero = " + isZero);

    }
}
