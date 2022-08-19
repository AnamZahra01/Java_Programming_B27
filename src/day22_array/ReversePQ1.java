package day22_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReversePQ1 {
    /*Create an array of 5 numbers. Manually reverse the array
No loop yet
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String revNumbers = numbers[4] + ", " + numbers[3] + ", " + numbers[2] + ", " + numbers[1] + ", " + numbers[0] ;

        System.out.println(Arrays.toString(numbers));
        System.out.println(revNumbers);
    }
}
