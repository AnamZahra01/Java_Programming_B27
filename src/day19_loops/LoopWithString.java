package day19_loops;

public class LoopWithString {
    public static void main(String[] args) {

        String s = "July";
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));

        System.out.println("-----------");
        //the other way round

        for (int i = 0 ; i < s.length(); i++ ){ //indexing starts from 0 in Strings.
            System.out.println(s.charAt(i));
        }
    }
}
