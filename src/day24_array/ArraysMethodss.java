package day24_array;

import java.util.Arrays;

public class ArraysMethodss {
    public static void main(String[] args) {

        int[] nums = {32, 5, -9, 3, 1, 20};
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("Min: " + nums[0]);
        System.out.println("Max: " + nums[nums.length - 1]);

        String[] strs = {"Hello", "world", "4four", "#Zebra", "apple","1aaaaa"};
        System.out.println(Arrays.toString(strs));
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

        char a = '#';
        System.out.println((int) a);

    }
}
