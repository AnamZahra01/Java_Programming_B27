package by_rreze.week1;
public class EvenOdd {
   // 1. Numbers -- odd & even (Write  a method which can identifies given number is even or odd)
    public static void evenOdd(int num){

        String output = num%2 == 0 ? "Even " :  "Odd ";
        System.out.println(num + " is " + output);
    }

    public static void main(String[] args) {
        evenOdd(5);
        evenOdd(100);
    }
}
//go for ternary operator