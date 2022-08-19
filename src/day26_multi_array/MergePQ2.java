package day26_multi_array;

import java.util.Arrays;

public class MergePQ2 {
    /*
    Given a 2D int array merge the elements into one 1D array
Ex:                  int [][] nums = {
                    {10, 20, 30}, {5, 10, 15}
                    };
       Output:      [ 10, 20, 30, 5, 10, 15 ]
     */
    public static void main(String[] args) {
        int[][] twoD = {
                {10, 20, 30, 40},
                {5, 10, 15, 50},
                {1,2,2,1,5}  //change in number of columns will give wrong results
        };
       // int oneDSize = twoD.length * twoD[1].length; //not good way for rows with varying columns

        int oneDSize = 0;
        for(int[] eachRow : twoD){ //perfect way to find size of array
            oneDSize += eachRow.length;
        }

        int[] oneD = new int[oneDSize];
        //traditional loop
        int newIndex = 0;
        for(int i = 0; i < twoD.length; i++){
            for(int j = 0; j < twoD[i].length; j++){
                oneD[newIndex++] = twoD[i][j];
            }
        }
        System.out.println(Arrays.toString(oneD));

//        int[] oneD = new int[oneDSize];
//        oneDSize= 0;
//
//        //for each loop
//        for(int[] eachArr : twoD){
//            for(int eachNum : eachArr){
//                oneD[oneDSize++] = eachNum;
//            }
//        }
//        System.out.println(Arrays.toString(oneD));

    }
}
