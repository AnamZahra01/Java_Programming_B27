package day24_array;

import java.util.Arrays;

public class SecondBiggestNumPQ5 {
    /*
    Second-Biggest Number
Given an Array of numbers. Find and print the 2nd biggest number.
Note the 2nd biggest should be unique meaning it should be different from the max number
Example:    Input: [4,3,1,4,5,2,4,8,4,8]
	       Output:    5
     */
    public static void main(String[] args) {

        int[] arr = {1,4,3,1,4,5,2,4,7,8,4,8};

        int biggestNum = arr[0];
       for(int num : arr){
           if(num > biggestNum){
               biggestNum = num;
           }
       }
        int secondBiggest = arr[0];
        for(int num : arr) {
            if (num > secondBiggest && num < biggestNum) {
                secondBiggest = num;
            }
        }
        System.out.println("Second Biggest Number: " + secondBiggest);
    }

}
