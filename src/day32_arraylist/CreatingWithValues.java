package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CreatingWithValues {
    public static void main(String[] args) {
        // convert array to ArrayList
        int[] arr = {3,5,1,1}; //array does not have methods so array -> ArrayList

        System.out.println(Arrays.toString(arr));

        Arrays.asList(arr); // converts array -> ArrayList -> not valid


        // create an ArrayList with initial values
        Integer[] arr2 = {3,4,4,6};
        ArrayList<Integer> nums = new ArrayList<>( Arrays.asList(arr2)); //arr is not valid because it is int primitive type -> not valid

        //the way we use to create ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,2,4,5,1,4));
        System.out.println(list);

        ArrayList<String> names = new ArrayList<>(
                Arrays.asList("james", "adam","ana", "jane")
        );
        System.out.println(names);

    }
}
