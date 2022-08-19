package day21_nested_loops;

public class ShapePQ2 {
    /*
    Print this shape:

    * * * * * * * *
    * * * * * * *       rows = 8; cols = 8;
    * * * * * *
    * * * * *
    * * * *
    * * *
    * *
    *

     */
    public static void main(String[] args) {
        for (int i = 8; i >= 1; i--){

           for (int j = i; j >= 1 ;j--){
                System.out.print("*" + " ");
            }
          System.out.println();
        }
    }
}
