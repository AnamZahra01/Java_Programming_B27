package day06_operators;

public class CharIncrement {
    public static void main(String[] args) {

        char letter = 'A';
        System.out.println(letter++);   //A
        System.out.println(letter);     //B
        System.out.println(++letter);   //C
        System.out.println(++letter); //D
        System.out.println();
        System.out.println("----------------");

        char letter2 = 'a';
        System.out.println(++letter2); //b
        System.out.println(++letter2);//c
        System.out.println(++letter2);//d
        System.out.println("----------------");

        char digits = '8';  //This is a char, not a digit.
        System.out.println(digits--);//8
        System.out.println(digits--);//7
        System.out.println(digits--);//6
        System.out.println(digits--);//5
        System.out.println(digits);//4
        System.out.println("------------------");

        char digit = '1';
        System.out.println((int)digit); //cast the char to an int, which means it prints the ASCII of that char.

        System.out.println(65);
        System.out.println((char)65);// casting int 65 to char, it will print the character that has ascii number 65

        //System.out.println((char)'A');

    }
}
