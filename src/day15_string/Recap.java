package day15_string;

public class Recap {
    public static void main(String[] args) {

        String first = "Testing";
        first = first.toUpperCase(); //Reassigninh, no need to have original one, reassign it
        System.out.println(first);

        String second = "SOFT SKILLS"; // Making new variable, here access to both original and new one
        String lowerSecond =second.toLowerCase();
        System.out.println("second = " + second);
        System.out.println("lowerSecond = " + lowerSecond);

        String third = "  hello world   ";
        System.out.println(third.length());
//        third.trim(); // reassign or make new variable, this will not trim
//        System.out.println(third.length());
        third = third.trim();
        System.out.println(third.length());
        System.out.println(third);


    }
}
