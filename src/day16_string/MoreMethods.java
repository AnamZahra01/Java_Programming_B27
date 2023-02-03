package day16_string;

public class MoreMethods {
    public static void main(String[] args) {

        String s = "hello";
        System.out.println(s.isEmpty()); // checks if the length = 0, checks for characters
        System.out.println(s.isBlank()); // checks for non-space characters

        String s1 = " ";
        System.out.println(s1.isEmpty()); //false // checks if the length = 0, String has 0 characters
        System.out.println(s1.isBlank()); //true

        String s2 = "A";
        System.out.println(s2.isEmpty()); // checks if the length = 0, String has 0 characters
        System.out.println(s2.isBlank());

        //replace
        String str = "java";
        str = str.replace('a','z');
        System.out.println(str); //jzaz

        String str1 = "a apple path";
        str1 = str1.replace("a","(a)");
        System.out.println(str1);

        //common use case: delete space
        String str2 = "multiple words here";
        str2 = str2.replace(" ","");
        System.out.println(str2);

        String str3 = "wooden spoon";
        str3 = str3.replace('o','_');
        System.out.println(str3);

        String str4 = "wooden spoon";
        System.out.println(str4.replaceFirst("o", "_"));

        //how to replace middle character only
        String str5 = "wooden spoon";
        int firsto = str5.indexOf('o');
        int secondo = str5.indexOf('o', firsto + 1);
        System.out.println(str5.substring(0,secondo)); // wo
        System.out.println(str5.substring(secondo).replaceFirst("o", "_")); //_den spoon
        System.out.println(str5.substring(0,secondo) + str5.substring(secondo).replaceFirst("o","_")); // wo_den space

        String str6 = "Anam\n";
        str6 = str6.repeat(5);
        System.out.println(str6);



    }
}
