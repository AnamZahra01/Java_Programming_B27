package day12_switch;

public class NumberToWord {
    public static void main(String[] args) {
        /*
        number to word
        1 -> one
        2 -> two
        .
        .
        default case
         */
        int number = 1;

        switch (number){

            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Numbner should be between 1 and 5");

        }


    }
}
