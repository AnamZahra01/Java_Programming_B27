package day25_arrays;

import java.util.Arrays;

public class Extra {
    public static void main(String[] args) {
        String[] nums = {"hello", "world","monday", "java"};
        System.out.println(Arrays.toString(nums));
        System.out.println(String .join("#", nums));
        System.out.println(String .join(" ", nums));
        System.out.println(String .join("MIDDLE", nums));

        int[] aa =  new int[]{1,5,2,5}; //quick way to create array with values
        System.out.println(Arrays.toString(aa));
        System.out.println(Arrays.toString(new int[]{3,5,2,6})); //prints array without reference, so cannot be reused.





    }
}
