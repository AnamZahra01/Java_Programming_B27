package day25_arrays;

import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] nums = {4,3,1,4,5,2,4,8,4,8};
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println("Max number: " + nums[nums.length-1]);

        int max = nums[nums.length - 1];
        for(int i = nums.length-1; i >= 0; i--){
            if(nums[i] != max){
                System.out.println("Second Max: " + nums[i]);
                break;
            }
        }

    }
}
