package day19_loops;

public class Test {
    public static void main(String[] args) {

        String str = "Today is THURSDAY Brodas";
        String strLower = str.toLowerCase();
        String camelCase = "";

        for (int i = 0; i < strLower.length(); i++) {
            if (strLower.charAt(i) == ' ') {
                camelCase += strLower.substring(i+1,i+2).toUpperCase();
                //System.out.println(camelCase);
                i++;
            } else {
                camelCase += strLower.charAt(i);
            }
        }

        System.out.println(camelCase.replace(" ", ""));
    }
}
