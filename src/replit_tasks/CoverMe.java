package replit_tasks;

import java.util.Scanner;

public class CoverMe {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            //System.out.println(coverString(in.nextLine(), in.nextLine()));
            System.out.println(coverString("wooden spoon", "o"));
        }

        public static String coverString(String main, String coverMe) {
            // your code here

            String output = "";
            if(main.contains(coverMe)){
                   output = main.replaceAll(coverMe,"["+coverMe+"]");
            } else {
                   output = "[" + main + "]";
            }
            return output;

        }

    }


