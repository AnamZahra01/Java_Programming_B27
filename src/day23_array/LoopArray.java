package day23_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LoopArray {
    public static void main(String[] args) {

        int[] nums = {4, 213, 6};

        //print whole array
        System.out.println(Arrays.toString(nums));

        System.out.println("\nHard-coded");
        //print each on separate line with hard coded index
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);

        System.out.println("\nWith for Loop");
        //printing each with for loop
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        //create our own printing format
        String arrayAsString  = "Array [ ";
        for (int i = 0; i < nums.length; i++){
           arrayAsString += nums[i]  + ", ";
        }
        arrayAsString =  arrayAsString.substring(0,arrayAsString.length()-2);
        arrayAsString += " ]";
        System.out.println(arrayAsString);

        System.out.println("\nFor each loop");
        for(int eachNumber : nums){
            System.out.println(eachNumber); //eachNumber == nums[i]
            /*
            for each loop: used to read only
            unable to change or reverse array
            designed only for going from beginning to end

             */
        }

    }
}
