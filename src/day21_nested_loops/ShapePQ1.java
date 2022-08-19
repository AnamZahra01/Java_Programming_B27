package day21_nested_loops;

public class ShapePQ1 {
    /*
    Print these shapes:

    * * * * * * * * *   rows = 8, col = 9
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++){   //rows

            for (int j = 1; j <= 9; j++){   //col
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------");

    }
}
