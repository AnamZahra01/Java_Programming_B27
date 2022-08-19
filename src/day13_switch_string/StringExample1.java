package day13_switch_string;
/*
String CLASS: in package java.lang -> package imported automatically.
 Strings are objects, non-primitive datatype (they take a lot of memory)

Notes: 1) String literals : use double quotes -> goes in string pool.
String pool -> helps string to take less memory.
        ex: String s = "Cydeo";
        2) new keyword create objects -> goes in heap.
        ex: String s = new String ("Cydeo");

Stack: name/ reference of the object
Heap memory: where the objects are stored, also where the string pool is.
 String pool: special memory location for String objects. It avoids duplicate objects and saves memory  when making String objects.

 String method: actions that change the characters in some way
 obj.method();
 equals(): checks if characters of String are same. It compares object location to check the value of String at those locations. returns boolean.

 "Scanner input = new Scanner" goes in heap memory.
Heap has String pool -> Strings
String str1 = "Java" -> java is literal.
 */
public class StringExample1 {
    public static void main(String[] args) {
        java.lang.String s = "first"; //literal "first" goes in pool
        String s2 = new String("second"); //object in the heap
        System.out.println(s2 == s); // compares two different objects

        String s3 = new String("first"); // compares objects in two different locations
        System.out.println(s3 == s);

        String s4 = "second";
        System.out.println(s == s4); // compares different objects in pool

        String s5 = "first";
        System.out.println(s == s5); // same object, having same address
    }
}
