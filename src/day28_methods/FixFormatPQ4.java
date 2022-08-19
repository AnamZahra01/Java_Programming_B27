package day28_methods;

public class FixFormatPQ4 {
    /*Fix Format: create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase
Ex:     Input:     jamES
	    Output:    James
     */
    public static String fixFormat(String str){
        str = str.toLowerCase();
        str = str.substring(0,1).toUpperCase() + str.substring(1);
        return str;
    }
    public static void main(String[] args) {
        System.out.println(fixFormat("jamEs"));
        System.out.println(fixFormat("jAMEs"));
        System.out.println(fixFormat("JaMES"));
    }
}
