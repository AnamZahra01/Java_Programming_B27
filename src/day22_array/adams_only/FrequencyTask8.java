package day22_array.adams_only;

public class FrequencyTask8 {
    /*
    Given a string find the frequency of characters
				Input : aaabbcccaacdddee
				Output: a5b2c4d3e2
     */

    public static void main(String[] args) {
        String str = "aaabbcccaacdddee";

        String output = "";
        for(int i = 0; i < str.length(); i++) {

            if (!output.contains(""+ str.charAt(i))) {
                int count = 0;
                for (int j = 0; j < str.length(); j++) {

                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                output += str.charAt(i);
                output += count;
            }
        }
            System.out.println(output);
    }
}
