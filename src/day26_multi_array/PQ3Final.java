package day26_multi_array;

public class PQ3Final {
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
                    {4, 1, 2, 5, 7, 8}, // arr[0]        -> arr[0][0] ,arr[0][1] ,arr[0][2] ,arr[0][3]
                    {2, 3, 5, 1, 7, 7}, //arr[1]         -> arr[1][0] ,arr[1][1] ,arr[1][2] ,arr[1][3]
                    {24, 1, 2, 1, 9, 7}  //arr[2]         -> arr[2][0] ,arr[2][1] ,arr[2][2] ,arr[2][3]
            };
            String common = "";

            for(int i = 0; i < arr[1].length; i++){  //row1 elements 1 by 1, 4
                for(int j = 0; j< arr[1].length; j++){ //row2, 24, 1, 5, 2
                    if(arr[0][i] != arr[1][j]) {      //if not found break -> if 4 then take next i = 1
                        continue;
                    } else{         //4 found, move to row3    (arr[i][j] == arr[1][j])
                        for( int k = 0; k < arr[1].length; k++){
                            if (arr[0][i] == arr[2][k]) {
                                if (!common.contains(""+arr[0][i])){
                                    common += " " + arr[0][i];
                                }
                                break;      //found -> store in String
                                //   commonElements[index++] = arr[i][j];  //store in new array
                            }
                        }
                    }
                    break;
                }}

            System.out.println(common);
        }}

/*
ALGO:
row 1, value 1 -> compare with row2
common values place in another array
common values  compare with 3rd row
 */

