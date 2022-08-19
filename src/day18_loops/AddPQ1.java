package day18_loops;

public class AddPQ1 {
    /*
    write a program that will add all the numbers from 1 to 500.
     */
    public static void main(String[] args) {

        int count = 1;
        int sum = 0;

        while (count <= 500){           // count = 1,2,3,4,....500

            sum += count;             // sum = sum + count
            count++;

        }
       System.out.println("Sum of numbers from 1 to 500 = " +sum);
    }
}
