package day21_nested_loops;

public class Duplicates {
    //apples -> p
    public static void main(String[] args) {

        String str = "apples are sours";
        String duplicates = "";

        for (int j = 0; j < str.length(); j++) { //4

            int count = 0;

            if (!duplicates.contains("" + str.charAt(j))) {
                for (int i = 0; i < str.length(); i++) { //4

                    if (str.charAt(j) == str.charAt(i)) {
                        count++;
                    }
                }

                if (count > 1) {

                    System.out.println(str.charAt(j) + " " + count);
                }
                duplicates += str.charAt(j);
            }
        }

    }
}



