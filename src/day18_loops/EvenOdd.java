package day18_loops;

public class EvenOdd {
    public static void main(String[] args) {

        int limit = 100;
       int counter = 1;

       //printing all even numbers

       while (counter <= limit) {            //run for limit number of times. Go from 1 to limit
           if (counter % 2 == 0) {
               System.out.print(counter + " ");
           }
           counter++;
       }

       // print all odd numbers from limit 1, backwards order

        int back = limit; // starting number based on limit variable
        while (back >= 1){

            if(back % 2 == 1){  //checks for odd != 0
                System.out.print(back + " ");
            }
            back--;
        }




//           else {
//               System.out.println(counter + " is odd");
//           }


    }
}
