package day28_methods;

public class SumPQ1 {
    /*
    Create a method that accept an int array. Take the sum of all the numbers and return the sum
     */

    public static int sumOfNumbers(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
         sum = sum + arr[i];
        }
        return  sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 5};
        System.out.println(sumOfNumbers(array));
    }
}
