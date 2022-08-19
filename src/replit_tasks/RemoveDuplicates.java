package replit_tasks;

public class RemoveDuplicates {

        public static void main(String[] args) {
            System.out.println(uniqueChars("java"));
            System.out.println(uniqueChars("hello world"));
        }

        public static String uniqueChars(String str) {

            String output = "";
            for(int i = 0;i < str.length(); i++) {
                if (!output.contains(""+str.charAt(i))) {
                    output += str.charAt(i);
                }
            }
            return output;
        }
}
