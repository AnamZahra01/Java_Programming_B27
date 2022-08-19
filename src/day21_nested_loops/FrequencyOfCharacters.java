package day21_nested_loops;

public class FrequencyOfCharacters {
/*
 word = java
 j = 1
 a = 2
 v = 1
 */
    public static void main(String[] args) {
//for each iteration of outer loop, inner loop goes from beginning to end
        String word = "java";
                    // 0123
        for (int j = 0; j < word.length(); j++) { //j

            int count = 0;

            for (int i = 0; i < word.length(); i++) { //java
                if (word.charAt(j) == word.charAt(i)) {
                    count= count + 1;
                }
            }

            System.out.println(word.charAt(j) + " - " + count);

        }

    }
}
