package day19_loops;

public class ForLoopExample {
    /* Explanation of for loop: called traditional loop
   for(initialization(executing once at start/optional part); condition; increment/updating variable(optional part)){
            Statements;
   }
    i.e:
    for (int i = 0; i < 7; i++){
            Statements;
    }
    i.e:
    for (; i < 7; ){
    //infinite loop
    }
     */
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){
            System.out.println(i+1);
        }
        /* Step 1: Initialization is executed:
            int i = 0;
            -> declaring and assigning a variable to be used int he loop. This variable keeps track of number of iterations.
            -> initialization occurs once in the beginning of the loop.

            Step 2: Termination condition/ boolean value is checked:
            -> if the boolean is true: code inside the loop is executed
            -> if the boolean is false: the loop stops
            -> i < 10;

            Step 3: code inside the loop are executed top to bottom
            System.out.println(" ");

            Step 4: update:
            -> the iteration of the variable executes
            -> i++;

            one iteration completed
            goes back to Step 2 and repeat.

         */
    }

    public static class PrimeNumber {
    }
}
