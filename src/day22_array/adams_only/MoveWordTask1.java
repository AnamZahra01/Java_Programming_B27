package day22_array.adams_only;

public class MoveWordTask1 {
    /*
     Move first word
					    Given a sentence. Display the sentence with the first word moved to the end of the sentence. Ex:
						    Input: Java is a fun language
						    Output: is a fun language Java
     */
    public static void main(String[] args) {
        String str = "Java is a fun language";

        String firstWord = str.substring(0, str.indexOf(" "));
        String lastPart = str.substring(str.indexOf(" ")+1);
        System.out.println(lastPart+ " " + firstWord);


    }
}
