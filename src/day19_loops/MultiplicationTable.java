package day19_loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        int num = 5; //change table by changing number or input.nextInt();
        for(int i = 1; i <= 10; i++){ // i goes from 1,2,...10;

            System.out.println(num + " * " + i + " = " + (num * i) );
            //num is same, i is updating from 1 to 10.
            // shortcut: fori and hit Enter;
        }
    }
}
