package day25_arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {6,23,100,240,2000};
        //           0  1  2  3   4
        System.out.println(Arrays.binarySearch(arr, 240)); //same as indexOf in String
        System.out.println(Arrays.binarySearch(arr, 2000));

        System.out.println("--------");
        int[] b = {6,2,-1,4,20,-14};
        System.out.println(Arrays.binarySearch(b,4)); //randomly correct
        System.out.println(Arrays.binarySearch(b,6));
        System.out.println(Arrays.binarySearch(b,-14));
         Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        System.out.println();
        System.out.println(Arrays.binarySearch(b,4));
        System.out.println(Arrays.binarySearch(b,6));
        System.out.println(Arrays.binarySearch(b,-14));
        System.out.println(Arrays.binarySearch(b,0));
        System.out.println("---------");
        System.out.println();

        String[] words = {"hello", "world","zebra", "water"};
        System.out.println(Arrays.binarySearch(words, "hello"));
        System.out.println(Arrays.binarySearch(words, "world"));
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.binarySearch(words, "hello"));
        System.out.println(Arrays.binarySearch(words, "world"));
        System.out.println(Arrays.binarySearch(words, "yellow"));







    }
}
