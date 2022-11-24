package by_rreze.week2;

//Swap two variable' values without using a third variable
public class SwapNumbers {

    public static void swap(int a, int b){
        System.out.println("Before Swapping:" + a + " , " +  b );
        a = a * b ; //a = 10 , b = 5
        b = a / b; //b = 2, a = 10
        a = a / b; //a = 5;
        System.out.println("After Swapping:" + a + " , " +  b );
    }
    public static void main(String[] args) {
        swap(2, 5);

    }
}
