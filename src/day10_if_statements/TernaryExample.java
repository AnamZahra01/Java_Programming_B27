package day10_if_statements;

public class TernaryExample {
    public static void main(String[] args) {

        int score = 80;

        if (score > 70){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        System.out.println("-----------------");


        int score2 = 50;
        String result;

        if(score2 > 70){
            result = "Pass";
        } else {
            result = "Fail";
        }
        System.out.println(result);
        System.out.println("-------------------");


        // Ternary:
       int score3 = 80;
       String result2 = score3 > 70 ? "Pass" : "Fail" ;
        System.out.println("result2 = " + result2);
        System.out.println(score3 > 70 ? "Pass" : "Fail");
        System.out.println("-------------------");

        int n=9;
        System.out.println(n % 2 == 0 ? "even" : "odd");
        System.out.println("-------------------");

        boolean isGreen = true;
        System.out.println(isGreen ? "Drive" : "Stop");
        System.out.println("-------------------");

        int num = 10;
        System.out.println(num > 0 ? "Positive" : num < 0 ? "Negative" : "Zero");
        System.out.println("-------------------");


/*
        if (isGreen){
            sout " Drive ";
            } else{
            sout "Stop";
            }
 */
    }
}
