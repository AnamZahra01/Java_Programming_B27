package day24_array;

import java.util.Arrays;

public class ReversePQ {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] reverse = new int[arr.length];

        for(int i = arr.length - 1, y = 0; i >= 0; i-- ,y++){ //i go backwards    :NEW:
           reverse[y] = arr[i];
        }
        System.out.println(Arrays.toString(reverse));

    }
}
