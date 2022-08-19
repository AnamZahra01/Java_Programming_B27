package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveNums {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
        System.out.println(nums);

        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) < 5){
                nums.remove(i);
                i--;
            }
        }
        System.out.println(nums);
        System.out.println("--------------------------");

        // removeIf( lambda );
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
        System.out.println(nums2);

        nums2.removeIf( n -> n < 5);
        System.out.println(nums2);
    }
}
