package day06_operators;

public class ClassQuestion {
    public static void main(String[] args) {

        int number = 10;

        boolean isEven = number % 2 ==0; //boolean is used as if True/ False
        boolean isOdd = number % 2 != 0;

        System.out.println(number+ " is Odd = " + isOdd);
        System.out.println(number+ " is Even = " + isEven);
    }
}
