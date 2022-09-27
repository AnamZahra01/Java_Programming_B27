package by_rreze;
    //2.Numbers -- Divide without / operator (Write a method that can divide two numbers without using division operator.)
public class DivideWithoutOperator {
    public static void divideWithoutOperator(int a, int b){
        if(a > b){
            if(a % b == 0){
                System.out.println(a + " is divisible by " + b);
            }else {
                System.out.println(a + " is in-divisible by " + b);
            }
        }else {
            System.out.println(a + "/" + b + ": For division first value needs to be bigger than second");
        }
    }
    public static void main(String[] args) {
        divideWithoutOperator(4, 2);
        divideWithoutOperator(100, 3);
        divideWithoutOperator(10, 100);
    }
}
