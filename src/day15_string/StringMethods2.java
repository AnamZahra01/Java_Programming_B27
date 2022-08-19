package day15_string;

public class StringMethods2 {
    public static void main(String[] args) {

        String word = "Java";
        System.out.println(word.startsWith("J"));
        System.out.println(word.startsWith("Ja"));
        System.out.println(word.startsWith("Jae"));

        System.out.println("------------------------");

        System.out.println(word.endsWith("a"));
        System.out.println(word.endsWith("A"));
        System.out.println(word.endsWith("Java"));
        System.out.println(word.endsWith("va "));

        System.out.println("--------------------------");

        String b = "hello world today";
        boolean bb = b.startsWith("hello");
        System.out.println(bb);

        System.out.println("--------------------------");

        String str = "today is 80 degrees";
        System.out.println(str.contains("today"));
        System.out.println(str.contains("it is")); // false,needs to be exact same sequence
        System.out.println(str.contains("degrees"));
        System.out.println(str.contains("it 80")); // false
        System.out.println(str.contains("80") && str.contains("today"));

        System.out.println("--------------------------");

        //Every character in String has an index number, starting from zero.
        //Position of a character in a String is called index.

        System.out.println(str.indexOf("i"));
    }
}
