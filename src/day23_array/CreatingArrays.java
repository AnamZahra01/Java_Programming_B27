package day23_array;

import java.util.Arrays;
import java.util.Scanner;

public class CreatingArrays {
    public static void main(String[] args) {
        /*
        Persons Information
        0 -> id
        1 -> first name
        2 -> last name
        3 -> batch num
        Imp: downsize of array: the size is fixed
         */

        String[] studentOne = {"04", "James", "Bond", "27"};
        System.out.println(Arrays.toString(studentOne));

        String[] studentTwo = new String[4]; //know number of elements, but not the values yet
        studentTwo[0] = "10";
        studentTwo[1] = "Olena";
        studentTwo[2] = "Habib";
        studentTwo[3] = "27";
        System.out.println(Arrays.toString(studentTwo));

//        //know number of elements and add from scanner
         Scanner input = new Scanner(System.in);
//        String[] studentThree = new String[4];
//        System.out.println("Enter your ID ");
//        studentThree[0] = input.next();
//        System.out.println("Enter your first name");
//        studentThree[1] = input.next();
//        System.out.println("Enter your last name");
//        studentThree[2] = input.next();
//        System.out.println("Enter your batch number");
//        studentThree[3] = input.next();
//        System.out.println(Arrays.toString(studentThree));

        //most dynamic:

        String[] studentFour = new String[4];
        String[]  questions = {"id", "first name", "last name", "batch number"};
        for(int i = 0; i < studentFour.length; i++){
            System.out.println("Enter your " + questions[i]);
            studentFour[i] = input.next();
        }
        System.out.println(Arrays.toString(studentFour));
    }
}
