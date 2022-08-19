package day21_nested_loops;

public class NestedLoop2 {
    public static void main(String[] args) {

        for(int i = 0; i < 8; i++){ //outer

            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        /*
         ITERATION 1:
         i = 0 ; j = 0
         ITERATION 2: i = 1 ; j = 0
         *
         ITERATION 3: i = 2 ; j = 0,1
         * *
         ITERATION 4: i = 3 ; j = 0,1,2
         * * *
         ITERATION 5: i = 4 ; j = 0,1,2,3
         * * * *
         ITERATION 6: i = 5 ; j = 0,1,2,3,4
         * * * * *

         */

    }
}
