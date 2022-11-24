package by_rreze.week4;

///3.Array -- Find Maximum
////Write a method that can find the maximum number from an int Array

import java.util.Arrays;
import java.util.Collections;

public class MaxNumber {

    public static void main(String[] args) {

        Integer [] arr = {1,2,3,20,5,7};
        System.out.println(maxNumber(arr));

    }
    public static int maxNumber(Integer [] arr){
        int maxValue =  Collections.max(Arrays.asList(arr));
        return maxValue;
    }
}

//Cs -> class, C = Framework/Interface
//To get maximum value -> use Collections.min() and Collections.max() methods.
//This method requires a list type -> convert array to list -> “aslist()” method.
