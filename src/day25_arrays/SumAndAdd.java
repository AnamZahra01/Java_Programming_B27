package day25_arrays;

import java.util.Arrays;

public class SumAndAdd {
        /*array: add all elements and add sum value to the end of array

        int[] = {5,1,2}
        int[] = {5,1,2,8}

         */
        public static void main(String[] args) {

            int[] arr = {5,1,2};
            int sum = 0;

            for(int each : arr){
                sum += each;
            }
            int[] newArr = Arrays.copyOf(arr, arr.length+1);
            System.out.println(Arrays.toString(newArr));
            newArr[newArr.length - 1] = sum; //storing sum to last index of new array
            System.out.println(Arrays.toString(newArr));

        }
}
