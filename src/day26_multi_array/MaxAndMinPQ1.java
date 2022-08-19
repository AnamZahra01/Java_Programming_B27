package day26_multi_array;

import java.util.Arrays;

public class MaxAndMinPQ1 {
    /*
    Given a 2D int array find the max and min number from the whole array
       int[][] {
              {1, 5, 2, 23},
              {-12, 41, -5, -2},
              {1, 5, 1, 5}
       }
       Max: 41
       Min -12
Extra: Find the max and min between each inner array
     */
    public static void main(String[] args) {

        int[][] arr = {
            {1, 5, 2, 23},
            {-12, 41, -5, -2},
            {1, 5, 1, 5}
        };

        int maxNum = arr[0][0];
        int minNum = arr[0][0];
       outer: for(int i = 0; i < arr.length; i++){ // number of elements in arr=  0,1,2

           int innerMax = arr[i][0];
           int innerMin = arr[i][0];
            inner: for(int j = 0; j < arr[i].length; j++){ //int in each element= 0,1,2,3

                if(arr[i][j] > maxNum){
                    maxNum = arr[i][j];
                } else if(arr[i][j] < minNum){
                    minNum = arr[i][j];
                }

                if(arr[i][j] > innerMax){
                    innerMax = arr[i][j];
                } else if(arr[i][j] < innerMin){
                   innerMin = arr[i][j];
               }

            }
           System.out.println( Arrays.toString(arr[i]) + " Max -> " + innerMax );
           System.out.println(Arrays.toString(arr[i]) + " Min -> " +  innerMin );
           System.out.println();
        }
        System.out.println("Max: " + maxNum);
        System.out.println("Min: " + minNum);

    }
}
/*
ALGO:
max = first int
min = first int
1. outer: for -> 1 iteration
2. inner: for -> goes from beginning to end for each outer iteration
if(nextNum > max) -> max = nextNum
if(nextNum < min) -> min = nextNum
 */