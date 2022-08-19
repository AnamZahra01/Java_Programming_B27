package day30_practice_wrapper;

public class WrapperClassExample2 {
    public static void main(String[] args) {


        System.out.println("Byte Min: " + Byte.MIN_VALUE);
        System.out.println("Byte Max: " + Byte.MAX_VALUE);

        System.out.println("Integer Min: " + Integer.MIN_VALUE);
        System.out.println("Integer Max: " + Integer.MAX_VALUE);

        System.out.println(Character.isDigit('4')); //true
        System.out.println(Character.isLetter('o')); //true
        System.out.println(Character.isUpperCase('e')); //false

        String s = "123";
        System.out.println(s + 5); //1235

        int i = Integer.parseInt(s); //converts String to Int type
        System.out.println(i+5); //addition 128
    }
}
