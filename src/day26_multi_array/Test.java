package day26_multi_array;

public class Test {
    public static void main(String[]args){
        int[][] arr = {
                {4, 1, 24, 5},
                {24, 1, 5, 2},
                {4, 1, 5, 1}
        };

        int[] arr1 = arr[0];
        int[] arr2 = arr[1];
        int[] arr3 = arr[2];

       String output = "";


            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    for (int k = 0; k < arr3.length; k++) {


                        if (arr1[i] == arr2[j] && arr2[j] == arr3[k] && arr1[i] == arr3[k]) {
                            if (!(output.contains("" + arr1[i]))) {

                                output = "" + arr1[i];
                                System.out.println(output);
                                //System.out.println(arr3[k]);
                            }}

                        }}}}}



