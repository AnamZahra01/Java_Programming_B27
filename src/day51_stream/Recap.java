package day51_stream;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Recap {
    public static void main(String[] args) {
        /*  1.1 Create a function that can check if two array are equal and contains the same elements
                ex: arr1 = {3,2,1},       arr2 = {2,1,3} ->      output: true
         */

        BiPredicate<int[], int[]> arrayEquals = (arr1, arr2) -> {
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1,arr2);
        };

        //int[] arr1 = {3,2,1};
        //int[] arr2 = {2,1,3};
        //System.out.println(arrayEquals.test(arr1, arr2));
//OR
        System.out.println(arrayEquals.test(new int[]{3, 2, 1}, new int[]{1, 2, 3}));
        System.out.println("-----------------------");

        //  1.2 Create a function that can check if the first array contains all the elements of the second array:
        //        ex: arr1 = {1,2,3,4,5,6} ,      arr2 = {7,8}      ->   output: false






        //1.1 Create a function that can returns the common characters of two strings
        //                ex: str1 = "Python"
        //                    str2 = "Wooden Spoon"
        //
        //                output: on


        BiFunction<String, String ,String> commonChars = (str1, str2) -> {

            String common = "";
            for(int i = 0; i < str1.length(); i++){
                if(!common.contains(str1.substring(i,i+1)) && str2.contains(str1.substring(i, i+1))){    //(str2.contains("" + str1.charAt(i)))
                    common += str1.charAt(i);
                }
            }
            return common;
        };

        System.out.println(commonChars.apply("Wooden Spoon" , "Python"));

    }
}
