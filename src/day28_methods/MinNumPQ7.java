package day28_methods;

public class MinNumPQ7 {
    //create a method that will accept an int array and return the smallest number from the array

    public static int smallestNumber(int[] arr){

        int smallestNum = arr[0];
        for(int each : arr){
            if(each < smallestNum){
                smallestNum = each;
            }}
        return smallestNum;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,-14,0};
        System.out.println(smallestNumber(array));

        int[] array1 = {500,200,-30,-14,110};
        System.out.println(smallestNumber(array1));
    }
}
