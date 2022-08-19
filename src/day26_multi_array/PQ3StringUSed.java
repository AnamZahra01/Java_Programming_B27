package day26_multi_array;

import java.util.Arrays;

public class PQ3StringUSed {
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
            int[][] arr ={
                    {4, 1, 24, 5},
                    {24, 1, 5, 2},
                    {4, 1, 5, 1}
            };

           int[] commonInRow1And2 = new int[arr[1].length];  int j = 0; // 0 0 0 0 -> 1,24,5,0
            int[] commonInArr = new int[arr[1].length]; int k = 0; //new array with index k




                for (int eachElement1 : arr[0]) {  //Row1: 4,1,24,5


                    for (int eachElement2 : arr[1]) {  //Row2 elements 24,1,5,2

                        if (eachElement1 == eachElement2) {  //comparing each element in row1 and row2

                            commonInRow1And2[j++] = eachElement1; //storing 1,24,5 in new array

                        }

                    }

                }


                for (int each : commonInRow1And2) {  //NewRow: 1,24,5,0


                    for (int eachElement3 : arr[2]) {  //Row3 elements 4,1,5,1

                        if (each == eachElement3) {  //comparing each element in row3 and NewRow

                            commonInArr[k++] = each; //  storing 1,24,5 in new array

                        }

                    }

                }



                System.out.println(Arrays.toString(commonInRow1And2));

                System.out.println(Arrays.toString(commonInArr));


        }
    }

/*
ALGO:
row 1, value 1 -> compare with row2
common values place in another array
common values  compare with 3rd row
put all common values in new array
 */

