package day23_array;

public class PQ1 {
    /*
    100 number array
	1. Create an int array called numbers that has length of 100
	2. Assign 1-100 to each index of the array. Then print your number array
     */
    public static void main(String[] args) {
        int[] numbers = new int[100];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i+1;
            System.out.print(numbers[i] + " ");
        }

    }
}
