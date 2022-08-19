package day13_switch_string;

public class Example2 {
    public static void main(String[] args) {

        String s = "java";
        String s2 = "java";
        // both are String literals -> String pool
        System.out.println(s == s2); // both have same address
        System.out.println(s.equals(s2)); //both have same value

    }
}
