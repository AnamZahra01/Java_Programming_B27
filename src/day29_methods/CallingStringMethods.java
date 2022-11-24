package day29_methods;

import my_utils.StringUtil;

public class CallingStringMethods {
    public static void main(String[] args) {

        System.out.println(StringUtil.reverse("hello world"));


        System.out.println(StringUtil.isPalindrome("racecar"));

        System.out.println(StringUtil.fixFormat("jAmEs"));

        System.out.println(StringUtil.camelCase("JAVA will ruLE tHe wORLd"));
        System.out.println("StringUtil.getDuplicateCharacters(\"apple\") = " + StringUtil.getDuplicateCharacters("apple"));
    }
}
