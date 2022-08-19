package day20_loops;

public class MiddleReverse {
    public static void main(String[] args) {
        String str = "I love java";
        int start = str.indexOf(' ')+1; //1st space
        int end =  str.lastIndexOf(' '); //last space

        String middleWord = str.substring(start,end);

        String reverseMiddle = "";
        for (int i = middleWord.length() - 1 ; i >= 0; i--){ // reverse middle word
            // 1234 -> length
            // love
            // 0123 -> i
            reverseMiddle += middleWord.charAt(i);


        }
        System.out.println(str.substring(0,str.indexOf(' ')+1) + reverseMiddle + str.substring(end-1));

        /*
        commented
        or

        String Str = "I love Java";
        String reverse = "";

        for (int i = str.lastIndexOf(' ')-1; i > str.indexOf(' '); i-- ){
            reverse += str.charAt(i);
        }

         */

    }
}
