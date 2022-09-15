package day41_exceptions.try_catch;

public class SecondTry {
    public static void main(String[] args) {

        try {
            int[] arr = {4, 2, 4, 1};
            System.out.println(arr[3]); //RTE
        } catch(ArrayIndexOutOfBoundsException e){


            System.out.println("Catch Block");
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Done");

        }

    }
}
