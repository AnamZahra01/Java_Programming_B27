package day30_practice_wrapper;

public class PQ1 {
    /*
    Write program that returns true if the total number of uppercase
characters are equal to total number of lowercase characters of a
string
Ex:          str = "JAVA java";
output:      true
     */
    public static boolean upperEqualsLower(String str) {
        int countUpper = 0, countLower = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                countUpper++;
            } else if (Character.isLowerCase(str.charAt(i))) {
                countLower++;
            }}
        return (countUpper == countLower) ;
    }

    public static void main(String[] args) {
        System.out.println(upperEqualsLower("JAVA java"));
        System.out.println(upperEqualsLower("JAVA is Fun"));

    }
}
