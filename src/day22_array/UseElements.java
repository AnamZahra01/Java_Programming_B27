package day22_array;

import java.util.Arrays;

public class UseElements {
    public static void main(String[] args) {

        int[] nums = {4, 5, 12};
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0] + nums[1]); //int + int

        String[] strs = {"Hello", "World", "Java", "Code"};
        System.out.println(strs.length);
        System.out.println(strs[2]);
        System.out.println(strs[2] + strs[3]); //concatenation
        System.out.println(strs[0].length()); //number of char in element 1
        System.out.println(strs[1].charAt(strs[1].length() -1)); //last index of element at index 1

        String s = strs[3]; //assigning value of 3rd index of array to new String variable s

    }
}
