package day27_methods;

public class CharPQ5 {
    /*
    create a method that accepts a String and print each character of the String on a separate line
     */

    public static void separateChar(String word){
        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        separateChar("Anam");
        separateChar("Java is fun");
        separateChar("Cydeo");
    }

}
