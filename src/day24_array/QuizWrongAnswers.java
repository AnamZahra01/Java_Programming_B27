package day24_array;

public class QuizWrongAnswers {
    public static void main(String[] args) {

        String ta = "A";
        ta += "B";
        String tb = "C";
        ta += tb;
        ta.replace('C','D'); //because we did not update String ta
        System.out.println(ta);

        System.out.println("----------------");

        int a = 0;
        while(a <= 5){
            a += 2;
        }
        System.out.println(a);

                System.out.println("----------------");

        int i = 0;
        do{
            i++;
            System.out.print(i + " ");
        } while (i % 2 == 1 );

    }
}
