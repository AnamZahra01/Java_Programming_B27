package day21_nested_loops;

public class FrequencyBySaim {

        public static void main(String[] args) {
        /*
        given a String determine how many times a character is in the String
         java

         j - 1
         a - 2
         v - 1

          j
            j == j
            j == a
            j == v
            j == a

          a
            a == j
            a == a
            a == v
            a == a


         */

            String str = "applesripe";
           String checked = "";

           outer: for (int i = 0; i < str.length(); i++) { //4

                int count = 0;

                if (!checked.contains("" + str.charAt(i))) {
                inner:    for (int j = 0; j < str.length(); j++) { //16

                        if (str.charAt(i) == str.charAt(j)) {
                            count++;
                        }
                    }

                    System.out.println(str.charAt(i) + " - " + count);
                   checked += str.charAt(i);
                }
            }

        }
   }

/*
        String str = "java";
        String checked = "";

        for(int i = 0; i < str.length(); i++){ // outer: iterating one character at a time --> charAt(i)

            int count = 0; // the counter should reset back to 0 for every character

            if(checked.contains("" + str.charAt(i))){
                continue;
            }

            for(int j = 0; j < str.length(); j++){ // inner: compare the character we are looking at( i ) with each other character in the String --> str.charAt(j)

                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }

            }

            System.out.println(str.charAt(i) + " - " + count);
            checked += str.charAt(i);

        }
 */


