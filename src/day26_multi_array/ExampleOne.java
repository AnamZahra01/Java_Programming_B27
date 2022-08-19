package day26_multi_array;

import java.util.Arrays;

public class ExampleOne {
    public static void main(String[] args) {

        char[] upper = {'R', 'J' , 'A'};
        char[] lower = {'p', 'z', 'q', 'e'};
        char[] other = {'4', '#', '*','$', '&'};

        char[][] chars = new char[3][];
        chars[0] = upper; //upper as first element of 2d array
        chars[1] = lower;
        chars[2] = other;

        System.out.println(Arrays.toString(chars[0]));
        System.out.println(Arrays.toString(chars[1]));
        System.out.println(Arrays.toString(chars[2]));

        System.out.println(Arrays.deepToString(chars)); //to print 2D array

    }
}
