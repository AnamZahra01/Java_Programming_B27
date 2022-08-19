package day26_multi_array;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        /*
        average of each array
        average of all numbers
         */

        int totalSum = 0;
        int totalElements = 0;

        int[][] nums = {
                {3,5,1,2},
                {2,1,5,10,8},
                {3,1,5,12}
        };

        for(int[] eachInner : nums){ //going through each inner array
            int sum = 0; //resets for next array

            for(int eachNum : eachInner){
                sum += eachNum;
            }

            System.out.println(Arrays.toString(eachInner));
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + (double)sum/eachInner.length);
            totalSum += sum;
            totalElements += eachInner.length;
            System.out.println();
        }

        System.out.println("Total average of nums: " +(double)totalSum/totalElements);
    }
}
