package day20_loops;

public class LoopStatements {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++){
            if (i == 3){
              continue;//  break;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        //continue -> skips only mentioned iteration
        //break -> stops the loop on that iteration

    }
}
