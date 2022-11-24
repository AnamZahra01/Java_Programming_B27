package by_rreze.week5;

public class FindMinimum {

    //Array -- Find Minimum
    //Write a method that can find the minimum number from an int Array

    public static int findMin(int...arr){

        int temp = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < temp){
                temp=arr[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(findMin(10, 2, 3, 6, 5, 7, 8));
    }
}
