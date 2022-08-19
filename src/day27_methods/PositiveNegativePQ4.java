package day27_methods;

public class PositiveNegativePQ4 {
    /*
    create a method that will accept a number. Find and print if it is a positive number, negative number, or zero
     */
    public static void positiveOrNegative(int number){
        if(number > 0){
            System.out.println(number + " is positive");
        } else if (number < 0){
            System.out.println(number + " is negative");
        } else if(number == 0){
            System.out.println(number + " is zero");
        }
    }

    public static void main(String[] args) {
        positiveOrNegative(5);
        positiveOrNegative(0);
        positiveOrNegative(-100);
    }

}
