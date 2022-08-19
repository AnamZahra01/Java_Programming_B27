package day26_multi_array;

public class CommonPQ3 {
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
        int number = 0;

       int x=0, y=0;
       while(x < arr.length && y < arr[x].length) {
           int count = 0 ;

           for (int i = 0; i < arr.length; i++) {

               for (int j = 0; j < arr[i].length; j++) {

                   if (arr[x][y] == arr[i][j]) {
                       count++;
                   }
                   number = arr[x][y];
               }
           }
           if (count > 1) {
               System.out.println(number);
               x++; y++;
           }
       }

    }
}
