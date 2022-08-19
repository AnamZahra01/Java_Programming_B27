package day15_string;
// index: position or place of character in String
public class CharAtMethod {
    public static void main(String[] args) {

        String s = "java";
        //          0123
        System.out.println("First char " + s.charAt(0)); // accessing char using index value
        System.out.println("Second char " + s.charAt(1));
        System.out.println("Third char " + s.charAt(2));
        System.out.println("Forth char " + s.charAt(3));
       // System.out.println("Invalid char " + s.charAt(100)); //100 is not a valid index in our String

        System.out.println("Length " + s.length());
        System.out.println("Last index " + (s.length()-1)); //length - 1 = 3
        System.out.println("------------------------------------");

        //reverse my String
        String s1 = "Java";
        System.out.print("" + s1.charAt(3) + s1.charAt(2) + s1.charAt(1) + s1.charAt(0)); // concatenation, not addition.






    }
}
