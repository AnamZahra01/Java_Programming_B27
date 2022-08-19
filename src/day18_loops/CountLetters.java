package day18_loops;

public class CountLetters {
    public static void main(String[] args) {

        String word = "frequency is word";
        int count = 0;

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'r'){
                count++;
            }
        }

        System.out.println(count);
    }
}
