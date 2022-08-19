package day28_methods;

public class Numbers {
     /*
    create a method that will accept a number. Find and print if it is a positive number, negative number, or zero
     */
    public static void checkNumber(int n){

        if(n > 0){
            System.out.println("Positive");
        }else if(n < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

    }

    public static void main(String[] args) {

        checkNumber(51);
        checkNumber(0);
        checkNumber(-90);

    }
}
