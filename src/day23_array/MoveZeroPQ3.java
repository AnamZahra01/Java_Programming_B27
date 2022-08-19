package day23_array;

import java.util.Arrays;

public class MoveZeroPQ3 {
    /*
    Move Zeros
	Write a program that will move all the zero numbers to the end of the array. The rest of the numbers will move over in position
Hint: You don’t have to manipulate the given array, try to use another array too. Think about the indexes
	Ex:
	Input:
		[10, 0, 5, 0, 1, 0]
	Output:
		[10, 5, 1, 0, 0, 0]
     */

    public static void main(String[] args) {
        int[] numbers = {10, 0, 5, 0, 1, 0};
        int values = 0; //0

        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i] < numbers[i+1] ) {
                values = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = values;
                i = i - 2;
            }
        }


        System.out.println(Arrays.toString(numbers));

    }
}
