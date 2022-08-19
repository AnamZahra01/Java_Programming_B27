package day30_practice_wrapper;

import java.util.ArrayList;
import java.util.Arrays;

public class IntroArrayList {
    public static void main(String[] args) {

        int[] a = {4,2,1};
        System.out.println("Number of elements: " + a.length);
        System.out.println(Arrays.toString(a));
        System.out.println("Access first element: " + a[0]);
        System.out.println("Add elements to array: CANNOT" );
        System.out.println("Remove elements to array: CANNOT" );
        System.out.println("Array holds value that are primitive types and object types" );

        System.out.println("-------------");

        ArrayList<Integer> nums = new ArrayList<>(); // empty ArrayList
        System.out.println("Number of elements: " + nums.size());
        System.out.println("Print whole ArrayList: " + nums);
        System.out.println("Add elements to ArrayList: add() method" );
        nums.add(5);
        nums.add(10);
        System.out.println(nums);
        System.out.println(nums.size());


    }
}
