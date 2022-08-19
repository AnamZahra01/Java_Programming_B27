package day26_multi_array;

import java.util.Arrays;

public class CommonPQ3ArrayUsed {
    /*
   Write a program that can print out the common elements from each inner element of a 2D
array
Ex:          int[][] arr {
             {4, 1, 24, 5},
             {24, 1, 5, 2},
             {4, 1, 5, 1}
      }
    */
    public static void main(String[] args) {
        int[][] arr = {
                {4, 1, 24, 5},
                {24, 1, 5, 2},
                {4, 1, 5, 1}
        };

        int[] commonInFirstAndSecondRow = new int[3] ; int j = 0;


        for(int eachElement1: arr[0]){  //Row1: 4,1,24,5


            for(int eachElement2: arr[1]){  //Row2 elements

                if(eachElement1 == eachElement2){  //comparing each element in row1 and row2

                    commonInFirstAndSecondRow[j++] = eachElement1; //  storing 1,24,5 in new array

                }

            }

        }

        for(int eachElement1: commonInFirstAndSecondRow){  //NewRow: 4,1,24,5
            j= 0;


            for(int eachElement3: arr[2]){  //Row2\3 elements

                if(eachElement1 == eachElement3){  //comparing each element in row3 and NewRow

                    commonInFirstAndSecondRow[j++] = eachElement1; //  storing 1,24,5 in new array

                   // System.out.println(Arrays.toString(commonInFirstAndSecondRow));
                }

            }

        }

       System.out.println(Arrays.toString(commonInFirstAndSecondRow));

    }
}

/*
ALGO:
row 1, value 1 -> compare with row2
common values place in another array
common values  compare with 3rd row
 */