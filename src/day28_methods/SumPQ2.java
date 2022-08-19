package day28_methods;

public class SumPQ2 {

    //Create a method that accept an int array. Take the sum of all the numbers and return the sum

    public static int sumOfArray(int[] arr){

        int sum = 0;
        for(int i = 0; i < arr.length; i++ ) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1 ,3, 5};
        System.out.println(sumOfArray(array));

        //input second array
        int[] array2 = {1 ,3, 10}; // sum = 14
        System.out.println("Sum = " + sumOfArray(array2));
    }}

