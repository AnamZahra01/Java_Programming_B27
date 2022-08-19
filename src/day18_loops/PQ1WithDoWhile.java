package day18_loops;

public class PQ1WithDoWhile {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        do {
            sum = sum + count;
            count++;

        }while (count <= 500);

        System.out.println(sum); //125250
    }
}
