package my_utils;

public class ArrayUtil {
    /*
    Group of utility methods for arrays
    Extra practices from 08/01 will be done here
     */
    /*
    Min Number
    create a method that will accept an int array and return the smallest number from the array
     */

    public static int minInArray(int... arr) {
        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    /*
    Max Number

create a method that will accept an int array and return the biggest number from the array

     */
    public static int maxInArray(int... arr) {
        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

/*
Contains

create a method that will accept an int array and an int number. Check and return if the given number is in the array.

 */

    public static boolean contains(int[] arr, int num) {
        for (int each : arr) {
            if (each == num) {
                return true;
            }
        }
        return false;       //return stops the method
    }


/*
Index of
 create a method that will accept an int array and an int number. Find and return the index of the number in the array. If there is multiple occurrence return the first occurrence's index*/

    //return first occurrence
    public static int indexNum(int[] arr, int num ) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }}
        return -1;
    }

    //return second occurrence

    public static int indexNum(int[] arr, int target, int startIndex ) { //overLoading: same name, different parameters

        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }}
        return -1;
    }

    /*Add Element

    create a method that will accept a String array and a String element. Add the given element value into the end of the array. Do not replace the last index of the given array, but instead create a new array with a bigger size to fit all the original elements plus the new one*/

   public static String[]  addElement(String[] arr,String element) {
        String[] newArr = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];   //copyOf -> newArr =Arrays.copyOf(arr,arr.length+1);
        }
        newArr[newArr.length - 1] = element;
        return newArr;
    }

/*Add Element

    overload the add element method to accept two String arrays. For this one add all the given elements from the second array in the first array.
    Ex: {"today", "is", "monday"}
        {"no", "soft-skills", "today"}
    output > [today, is, monday, no, soft-skills, today]*/

        public static String[] addElement(String[] original, String[] other ){
            String[] merged = new String[original.length + other.length];

            for(int i = 0; i < original.length; i++){
                merged[i] = original[i];
            }
            for(int i = original.length,j=0;i < merged.length; i++,j++){
                merged[i] = other[j];
            }
            return merged;
        }

}
