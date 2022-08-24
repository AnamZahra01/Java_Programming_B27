package office_hours_practice.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {

        ArrayList<String> passwords = new ArrayList<>(Arrays.asList("one", "hi", "hold","hello"));
        ArrayList<String> newPassword = new ArrayList<>();

        for (String each : passwords) {

           String  hiddenPassword = hidePassword(each, '*');
            newPassword.add(hiddenPassword);
        }
        System.out.println(newPassword);
    }
        public static  String hidePassword(String each, char c){
            String  hiddenPassword = "";

            for(int i = 0; i < each.length(); i++){
                hiddenPassword += c;
            }

            return hiddenPassword;
        }

}
