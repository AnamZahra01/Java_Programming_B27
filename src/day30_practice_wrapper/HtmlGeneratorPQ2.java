package day30_practice_wrapper;

public class HtmlGeneratorPQ2 {
    /*
    HTML Generator
 Given a String in the following format take the number part of the generator the html tags.
 Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^
   Ex:   Input:      div^2
         Output:     <div></div> <div></div>
   Ex:   Input:      li^3
         Output:     <li></li><li></li><li></li>
     */
    public static String HtmlGenerator(String str){

        Integer value = Integer.parseInt(str.substring(str.length()-1));
        String output = "";
        for(int i = 0; i < value; i++ ){
            output += "<" + str.substring(0, str.length()-2) + "></" + str.substring(0, str.length()-2) + "> ";
        }
        return output;
    }
    public static void main(String[] args) {

        System.out.println(HtmlGenerator("div^2"));
        System.out.println(HtmlGenerator("li^3"));
        System.out.println(HtmlGenerator("html^5"));

    }
}
