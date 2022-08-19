package day28_methods;

import java.util.Arrays;

public class AddElementPQ10 {
    /*
    Add Element: create a method that will accept an int array and an int number. Return an array with the given number added to the end of the array
     */

    public static int[] addElementInArray(int[] arr, int num){
        int[] arrCopy;
        arrCopy = Arrays.copyOf(arr, arr.length+1);
        arrCopy[arrCopy.length -1] = num;
        return arrCopy;
    }

    public static void main(String[] args) {
        int[] array =  {2,5,7,11};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(addElementInArray(array, 21)));
        System.out.println(Arrays.toString(addElementInArray(array, 511)));

    }



//    public static void main(String[] args) {
//        int[] arr= {15,50,-2,58,155,-25};
//
//        System.out.println(Arrays.toString(addElement(arr, 154879)));
//    }
//
//    public static int[] addElement(int[] arr, int number) {
//        int[] newArr = Arrays.copyOf(arr, arr.length+1);
//        newArr[newArr.length-1] = number;
//        return newArr;
//    }
}
