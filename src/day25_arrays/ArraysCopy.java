package day25_arrays;

import java.util.Arrays;

public class ArraysCopy {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        int[] other = nums; //1 object, other is pointing to same array, not creating new one.

        nums[0]= 10;
        other[2] = 25;

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(other));
        System.out.println("-------------");

        int[] arr = {3,4,1,5,12,5,-10}; //Arrays can be changed, Strings are immutable
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //copyOf
        int[] a = {5,10,15};
        int[] b = Arrays.copyOf(a,3);
        System.out.println("Before");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        a[1] = 100;
        System.out.println("After");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
