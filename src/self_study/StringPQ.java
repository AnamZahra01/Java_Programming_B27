package self_study;

import java.util.Arrays;

public class StringPQ {
    public static void main(String[] args) {

        String str = " I   love    java       programming  ";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        String out = "";
        for(String each : arr){
            if(!each.equals("")){
                out += " "+each;
            }
        }
        System.out.println(out);

    }
}
