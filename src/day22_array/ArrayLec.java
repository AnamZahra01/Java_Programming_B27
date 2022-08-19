package day22_array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLec {
    public static void main(String[] args) {

    /*
    Array holds multiple data into one place.
    Array is Object.
    OR An array is a container object that holds a fixed number of values of same datatype

    declaring:    dataType[] arrayName; -> int[] scores;
    declaring & assigning:  dataType[] arrayName = array;
    scores = new int[4];  -> making empty array which can store 4 possible elements, 4 empty spaces for elements
    OR
    int[] scores = new int[4];
     */


        Scanner input = new Scanner(System.in);
        int num = input.nextInt();


        for(int j = 0; j < num; j++){
            String str = input.nextLine();

            String [] arr = str.split(" ");
            System.out.println(Arrays.toString(arr));

            String output = "";

            for(int i = 0; i < arr.length; i++){
                if(!output.contains(arr[i])){
                    output += arr[i]+ " ";
                }
            }
            output = "\n";
            System.out.println(output);

        }

    }
    }

