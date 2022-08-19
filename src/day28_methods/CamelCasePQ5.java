package day28_methods;

public class CamelCasePQ5 {
    /*
    Camel Case: create a method that will accept a String, of words separated by spaces, and return a camel case version of the String where the first letter of each word is Uppercase and the rest of the word is in lowercase. Exception: First word starts with lowercase
Ex:     Input:      JAVA will ruLE tHe wORLd
        Output: 	javaWillRuleTheWorld
     */

    public static String camelCaseConversion(String str){

        String camelCase = "";
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                camelCase += str.substring(i + 1, i+2).toUpperCase();
                i++;
            }else {
                camelCase += str.substring(i, i + 1);
            }}
        return camelCase;
    }
    public static void main(String[] args) {
        System.out.println(camelCaseConversion("JAVA will ruLE tHe wORLd".toLowerCase()));
    }
}
