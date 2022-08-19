package day24_array;

import java.util.Arrays;

public class PQ5OtherWay {
    public static void main(String[] args) {
        int[] arr = {1,4,3,1,4,5,2,4,7,3,8,4,8};

        Arrays.sort(arr);
        int biggestNumber = arr[arr.length-1];

        int secondBiggest = arr[0];
        for(int num : arr){
            if(num > secondBiggest && num < biggestNumber){
                secondBiggest = num;
            }
        }
        System.out.println("Second Biggest Number: " + secondBiggest);
    }
}
