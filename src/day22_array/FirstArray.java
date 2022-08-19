package day22_array;

public class FirstArray {
    public static void main(String[] args) {

        int[] nums;  //declaration
        nums = new int[5];  //initialize with 5 spaces -> [0, 0, 0, 0, 0]

        System.out.println(nums[0]);

        nums[0] = 10;   //assigning 10 to position zero -> 1st element
        System.out.println(nums[0]);

        nums[3] = 25;   //store 25 as element 3
        System.out.println(nums[3]);    //[10, 0, 0, 25, 0]

        int[] other = {5, 7, 10, -8, 20, 12};
        System.out.println(other[0]);
        System.out.println(other[1]);
        System.out.println(other[2]);
        System.out.println(other[3]);
        System.out.println(other[4]);
        System.out.println(other[5]);

    }
}
