package day27_methods;

import java.util.Arrays;

public class MergeBest {
      /*
    Given a 2D int array merge the elements into one 1D array
Ex:                  int [][] nums = {
                    {10, 20, 30}, {5, 10, 15}
                    };
       Output:      [ 10, 20, 30, 5, 10, 15 ]
     */
      public static void main(String[] args) {

          int [][] nums = {
                  {10, 20, 30},
                  {5, 10, 15},
                  {1,2,3,4}
          };
          int size = 0;
          for(int[] eachArray  : nums){ //NEW:count total number of elements, good with rows having varying columns
              size += eachArray.length;
           //   System.out.println(Arrays.toString(eachArray));
             // System.out.println(size);
          }

          int[] merged = new int[size];
          int indexToStore = 0;

          for(int[] eachArray  : nums){
              for(int eachNum :  eachArray){
                  merged[indexToStore++] = eachNum;
              }
          }
          System.out.println(Arrays.toString(merged));
      }
}
