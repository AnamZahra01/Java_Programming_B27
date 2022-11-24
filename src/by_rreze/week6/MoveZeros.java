package by_rreze.week6;

import java.util.Arrays;

public class MoveZeros {
    //2.Array -- Move Zeros to the End
    //Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)

    public static int[] moveZeroes(int[] array){

        int[] newArr = new int [array.length];

        int j = 0;
        for (int i= 0; i < array.length; i++) {

            if(array[i] != 0){
                newArr[j++] = array[i];
            }
        }
        return newArr;
    }

    public static int[] moveZeroesAsc(int[] arr){

        for(int i = 0; i  < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {

        int[] array = {2,0,5,0,1,7,0};
        System.out.println(Arrays.toString(moveZeroes(array))); //keeping order
        System.out.println();

        System.out.println("Descending " + Arrays.toString(moveZeroesAsc(array)));
    }


}
