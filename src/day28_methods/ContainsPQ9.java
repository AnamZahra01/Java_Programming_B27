package day28_methods;

public class ContainsPQ9 {
    //create a method that will accept an int array and an int number. Check and return if the given number is in the array.
    public static boolean containsNumber(int[] arr, int num){

      boolean isInArray = false;
      for(int each : arr){
          if(each == num){
              isInArray = true;
          }}
      return isInArray;
    }

    public static void main(String[] args) {
        int number = 5;
        int[] array = {1,5,9,15};
        System.out.println(containsNumber(array, number));
    }}
