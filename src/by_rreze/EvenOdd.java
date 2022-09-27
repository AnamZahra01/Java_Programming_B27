package by_rreze;
public class EvenOdd {
   // 1. Numbers -- odd & even (Write  a method which can identifies given number is even or odd)
    public static void evenOdd(int num){
        if(num%2 == 0){
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

    public static void main(String[] args) {
        evenOdd(5);
        evenOdd(100);
    }
}
