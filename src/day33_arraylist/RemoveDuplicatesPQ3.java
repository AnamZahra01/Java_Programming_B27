package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicatesPQ3 {
    /*
    Remove Duplicates: Create a method that will take an ArrayList of numbers and remove any duplicates values. The method will return an ArrayList of unique elements.
@param nums - The given ArrayList of numbers
@return - ArrayList of numbers
Ex:     Input: {1, 3, 5, 1, 4, 5, 9};
        Output: {3, 4, 9};
     */
    public static ArrayList<Integer> uniqueElements(ArrayList<Integer> nums){
        ArrayList<Integer> uniques = new ArrayList<>();

        for(int i = 0; i < nums.size(); i++){
            int count = 0;
            for(int j = 0; j < nums.size(); j++){
                if(nums.get(i) == nums.get(j)){
                    count++;
                }}
            if(count == 1){
                uniques.add(nums.get(i));
            }}
        return uniques;
    }

    public static ArrayList<Integer> uniqueElements2(ArrayList<Integer> nums){
        nums.removeIf(p -> (Collections.frequency(nums, p ) > 1));
        return nums;
    }
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println("Input: " + input);
        System.out.println("Output: " + uniqueElements( input));

        input.addAll(Arrays.asList(1,4,3,9,7,12));
        System.out.println("New Input: " + input);
        System.out.println("New Output: " + uniqueElements2(input));

    }
}
