package AGroupPractice;

public class ReverseString {

    public static String reverseString(String str) {
        String output = "";

        for(int i = str.length()-1; i >= 0 ; i-- ){

            output += str.charAt(i);

        }

        return output;

    }

    public static void main(String[] args) {
        System.out.println("reverseString(\"anam\") = " + reverseString("anam"));
    }
}
