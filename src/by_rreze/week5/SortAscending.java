package by_rreze.week5;

//Array -- Sort Ascending
//Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
//Ex:   int[] arr = {10, 9, 8, 7};
//arr = Sort(arr);         ==>{ 7, 8, 9, 10};

import java.util.Arrays;
import java.util.Collections;

public class SortAscending {

    public static void arraysClassMethod(int[] array){
        Arrays.sort(array);
        System.out.println("Arrays.asList(array) = " + Arrays.toString(array));
    }

    public static Integer[] collectionsClassMethod(Integer[] array){
         Collections.sort(Arrays.asList(array));
         return  array;
    }

    public static int[] sortAscend(int...arr){

        for(int i = 0; i  < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] input = {10, 9, 7, 8, 9};
        int[]value = sortAscend(input);
        System.out.println("Arrays.toString(value) = " + Arrays.toString(value));

        arraysClassMethod(input);

        Integer[] inputArr = {10, 9, 7, 8, 9};
        Integer[] result= collectionsClassMethod(inputArr);
        System.out.println("Arrays.asList(array) = " + Arrays.toString(result));

    }
}
