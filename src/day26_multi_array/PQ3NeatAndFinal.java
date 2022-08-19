package day26_multi_array;

public class PQ3NeatAndFinal {

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
                    {4, 1, 24, 5, 7, 8}, // arr[0] -> arr[0][0] ,arr[0][1] ,arr[0][2] ,arr[0][3]
                    {24, 1, 5, 2, 7, 7}, //arr[1]  -> arr[1][0] ,arr[1][1] ,arr[1][2] ,arr[1][3]
                    {4, 1, 5, 1, 24, 7}  //arr[2]  -> arr[2][0] ,arr[2][1] ,arr[2][2] ,arr[2][3]
            };

            String common = "";

            for(int i = 0; i < arr[0].length; i++){ //0 -> 5
                for(int j = 0; j< arr[0].length; j++){
                    for( int k = 0; k < arr[0].length; k++) {

                        if ((arr[0][i] == arr[1][j]) && (arr[0][i] == arr[2][k])) {

                            if (!common.contains("" + arr[0][i])) {
                                common = "" + arr[0][i];
                                System.out.print(common + " ");

                            }}  }}} }}

