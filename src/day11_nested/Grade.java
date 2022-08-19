package day11_nested;

public class Grade {
    public static void main(String[] args) {

        int score = 55;

        if (score >= 75 ) {
            System.out.println("Pass");

            if (score > 92){
                System.out.println("you did really well");
            } else if (score > 80) {
                System.out.println("Good job");
            }

        } else { //score < 75
            System.out.println("Failed");

            if (score > 60){
                System.out.println("try harder");
            } else { // score < 60
                System.out.println("study much more");
            }
        }


    }
}
