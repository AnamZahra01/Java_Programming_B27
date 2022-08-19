package day28_methods;

public class PalindromePQ1 {
    //create a method that will accept a String and find if it is Palindrome or not (boolean)

    public static boolean isStringPalindrome(String str){

        String reverseStr = "";
        for(int i = str.length()-1; i >= 0; i--){
          reverseStr += str.charAt(i);
        }
        return str.equalsIgnoreCase(reverseStr);
    }

    public static void main(String[] args) {
        System.out.println(isStringPalindrome("Level"));
        System.out.println(isStringPalindrome("Cydeo"));
        System.out.println(isStringPalindrome("Racecar"));

    }
}
