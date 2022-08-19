package day26_multi_array.ByAdam;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {


        String sentence = "I like playing Football, Tennis";

        sentence = sentence.replace(",", "");
        String[] words = sentence.split(" ");

    /*
    put 1 in another variable
    1 2 3
    2 2 3
    2 3 3
    2 3 1
     */
        int[] x = {1, 2, 3, 4, 5, 6, 7};//  2,3,4,5,6,1
        //index // 0, 1, 2, 3, 4, 5 length of x =6
                //2,2,3,4.5.6
        //2,3,3,4,5,6
        //2,3,4,4,5,6
        //2,3,4,5,5,6
        //2,3,4,5,6,6
        //2,3,4,5,6,

        //empty glass1 = black;
 //     white , red, black
        int var = x[0]; // var =1

int i=2;
      //  for (int i = 0; i < x.length - 1; i++) {
//at the last i=x.length-2  i+1=x.length-1
            x[i] = x[i + 1]; // x[0] = x[1]
            //x[1] = x[2]
        //}
        x[x.length - 1] = var; //last index = 1;
        System.out.println("Arrays.toString(x) = " + Arrays.toString(x));
    }
}
