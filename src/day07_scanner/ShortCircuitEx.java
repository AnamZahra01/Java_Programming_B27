package day07_scanner;

public class ShortCircuitEx {
    public static void main(String[] args) {

        System.out.println(true && true);
        System.out.println(true && false);

        System.out.println(true || true);
        System.out.println(true || false);

        //System.out.println(5/0); --> you can not divide by zero

       // System.out.println(true && 5/0 == 0); //gives error
       System.out.println(false && 5/0 == 0); //does not compile fully, because the result is always false

       // System.out.println(false & 5/0 == 0);
        int count = 0;
        System.out.println(true || count++ == 1); //compiler reads just first condition and gives answer here.
        System.out.println("count = " + count); //OR needs just one true condition. it does not care about rest of the conditions.




    }
}
