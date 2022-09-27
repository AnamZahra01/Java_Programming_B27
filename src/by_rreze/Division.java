package by_rreze;
//2.Numbers -- Divide without / operator (Write a method that can divide two numbers without using division operator.)
public class Division {
    public static void divisible(int a, int b){
        int remainder = a , quotient = 0;

        while (remainder >= b){
             quotient++;
             remainder -= b;
        }
        if(remainder == 0){
            System.out.println(a + " is Divisible by " + b + " \t | " + a + "/" + b + " = " + quotient + ", remainder = " + remainder );
        }else{
            System.out.println(a + " is In-Divisible by " + b + "  | " + a + "/" + b + " = " + quotient + ", remainder = " + remainder );
        }
    }
    public static void main(String[] args) {
        divisible(10,2);
        divisible(10,3);
    }
}
