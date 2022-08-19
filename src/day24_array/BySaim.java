package day24_array;

import java.util.Arrays;

public class BySaim {
    public static void main(String[] args) {
        int [] nums = {32, 5, -9, 3, 1, 20, 32};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));


        // max & min
        System.out.println("Min: " + nums[0]);
        System.out.println("Max: " + nums[nums.length -1]);

    }
}
