package day24_array;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {

        int[] nums = {10, 0, 5, 0, 1, 0};
        int[] fixed = new int[nums.length]; // [0, 0, 0, 0, 0, 0]
        int indexToRead = 0; //same as i in for loop
        int indexToStore = 0;

        while(indexToRead < nums.length){
            if(nums[indexToRead] != 0){

                fixed[indexToStore] = nums[indexToRead];
                indexToStore++;
            }
            indexToRead++;
        }

        System.out.println(Arrays.toString(fixed));
    }
}
