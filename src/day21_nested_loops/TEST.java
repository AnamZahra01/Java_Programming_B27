package day21_nested_loops;

public class TEST {
    public static void main(String[] args) {

        String str = "AAABCCDEEF";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            if (checked.contains("" + str.charAt(i))) {
                continue;
            }

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }if(count > 2){
                    System.out.println(str.charAt(i) + " is first duplicated character.");
                    checked += str.charAt(i);
                    break;
                }


            }if (count == 1) {
                System.out.println(str.charAt(i) + " is first unique character and index number of B is: " + str.indexOf('B'));
                break;

            }

        }
    }
}

