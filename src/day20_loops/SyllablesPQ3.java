package day20_loops;

public class SyllablesPQ3 {
    /*
    Syllables
    Given a String separated by dashes calculate how many syllables the words are
        Ex:
            Input:
             str ->   ja-va
            Output:
             int ->    2

             ALGO:
             1. run for loop for whole String.
             2. if (str.charAt(i) = '-') -> counter gets incremented

     */
    public static void main(String[] args) {

        String str = "ja-va";

        int count=1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-'){
                count++;
            }
        }
        System.out.println(count + " syllables");

    }
}
