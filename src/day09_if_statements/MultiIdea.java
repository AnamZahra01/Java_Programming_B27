package day09_if_statements;
/*
    number -> month
    1 jan
    2 feb
    12 dec
 */
public class MultiIdea {
    public static void main(String[] args) {
        int month =12;

        if(month == 1){
            System.out.println("January");
        }
        else if(month == 2){
            System.out.println("February");
        }
        else if (month == 12){
            System.out.println("December");
        } else {
            System.out.println("its not month");
        }

    }
}
