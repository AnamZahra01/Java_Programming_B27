package day23_array;

import java.util.Arrays;

public class ReversePQ2 {
    /*
    Write a program that will reverse the order of any given array
		Ex:
		Input:
			[1, 2, 3, 4, 5]
		Output:
			[5, 4, 3, 2, 1]
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbersReverse = new int[numbers.length];

//        for (int i = 0; i < numbers.length; i++){
//            numbersReverse[i] = numbers[numbers.length-(i+1)];
//        }

        //or
        int j = 0;
        for(int i = numbers.length -1 ; i >= 0; i-- ){
            numbersReverse[j++] = numbers[i];
        }

        System.out.println(Arrays.toString(numbersReverse));
    }
}
/*
0 ->
 */