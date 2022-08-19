package day28_methods;

public class NumberToWord {
    // 5 -> five

    public static String numberToWord(int n){ //better one to have return at the end only

        String word = "";
        switch (n){
            case 1:
                word = "One";
                break;
            case 2:
                word = "Two";
                break;
            case 3:
                word = "Three";
                break;
            case 4:
                word = "Four";
                break;
            case 5:
                word = "Five";
                break;
            case 6:
                word = "Six";
                break;
            case 7:
                word = "Seven";
                break;
            default:
                word = "Invalid Range";
        }

        return word; //method finishes (return = break)
    }


 public static String numberToWord2(int n) {
     switch (n) {
         case 1:
             return "One";
         case 2:
             return "Two";
         case 3:
             return "Three";
         case 4:
             return "Four";
         case 5:
             return "Five";
         case 6:
             return "Six";
         case 7:
             return "Seven";

     }
     return "Invalid";
 }

    public static void main(String[] args) {
        System.out.println(numberToWord(1));
        System.out.println(numberToWord2(7));
        System.out.println(numberToWord2(9));
        System.out.println(numberToWord(9));
    }


    }