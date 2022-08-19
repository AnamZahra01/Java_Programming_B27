package day06_operators;
/*  PQ-01.  Create a class named Castings
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to each of them:
                             byte num1;
                             short num2;
                             int num3;
                             long num4;
                             float num5
                             double num6;
     -----------------------------------------------------------------------------------------
     Self study (Points to remember):
     . Type casting assigning a value of one primitive data type to another type.

     . Widening Casting (automatically) - converting a smaller type to a larger type size
       byte -> short -> int -> long(L) -> float(F) -> double

     . Narrowing Casting (manually) - converting a larger type to a smaller size type
       double -> float -> long -> int -> short -> byte
 */
public class Castings {
    public static void main(String[] args) {

        float averageScore = 20.5F;         //declaration,

        byte num1 = (byte) averageScore;    // float to byte --> larger to smaller datatype --> manualTypeCasting results in data loss.
        System.out.println("num1 = " + num1);

        short num2 = (short) averageScore ;  // float to short --> larger to smaller datatype --> manualTypeCasting
        System.out.println("num2 = " + num2);

        int num3 = (int) averageScore;      // float to int --> larger to smaller datatype --> manualTypeCasting
        System.out.println("num3 = " + num3);

        long num4 = (long) averageScore;    // float to long --> larger to smaller datatype --> manualTypeCasting
        System.out.println("num4 = " + num4);

        float num5 =  averageScore;         // float to float --> same datatype --> autoTypeCasting
        System.out.println("num5 = " + num5);

        double num6 = averageScore;         // float to double --> smaller to larger datatype --> autoTypeCasting
        System.out.println("num6 = " + num6);

        char num7 = 65;                     // converting int -> char
        System.out.println("num7 = " + num7);

        int num8 = 'A';                     // converting char -> int.
        System.out.println("num8 = " + num8);

        char num9 = (char)num4;
        System.out.println("num9 = " + num9);
    }
}
