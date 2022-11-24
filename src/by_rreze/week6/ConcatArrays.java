package by_rreze.week6;

import java.util.Arrays;

public class ConcatArrays {
    //3.Array -- Concat two arrays
    //Write a return method that can concat two arrays

    public static int[] concatArrays(int[] arr1,int[] arr2){

        int[] arr3 = new int[arr1.length + arr2.length];

        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[j++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[j++] = arr2[i];
        }
        return arr3;
    }
    public static void main(String[] args) {

        int[] arrA = {1,2,3};
        int[] arrB = {4,5,6,7};

        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(concatArrays(arrA, arrB)));

    }
}
