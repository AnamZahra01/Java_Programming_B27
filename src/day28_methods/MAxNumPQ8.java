package day28_methods;

public class MAxNumPQ8 {
    /*
    Max Number: create a method that will accept an int array and return the biggest number from the array
     */
    public static int biggestNumber(int[] arr){

        int biggestNum = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > biggestNum){
                biggestNum = arr[i];
            }}
    return  biggestNum;
    }

    public static void main(String[] args) {
        System.out.println(biggestNumber(new int[]{1,51,4,7,9}));
        System.out.println(biggestNumber(new int[]{1,-51,14,75,900}));
        System.out.println(biggestNumber(new int[]{0,-1,140,19, 85}));
    }
}
