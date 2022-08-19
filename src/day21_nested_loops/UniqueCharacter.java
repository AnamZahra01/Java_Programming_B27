package day21_nested_loops;

public class UniqueCharacter {
    //Print unique characters: java -> jv
    public static void main(String[] args) {

        String str = "java";
                    //0123

        for(int j = 0; j < str.length(); j++) {
            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if(str.charAt(j) == str.charAt(i)){
                    count++;
                }

            }

            if (count < 2) {
                System.out.println("Unique Character: " + str.charAt(j));
            }
        }

    }
}
