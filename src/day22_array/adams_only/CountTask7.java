package day22_array.adams_only;

public class CountTask7 {
    /*
    Find and print how many words are in the given String.

			  Input: thisHasManyWordsToFind Output: 6
     */
    public static void main(String[] args) {
        String str = "thisHasManyWordsToFind";

        int countWords = 1;
        String eachWord = "";

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) > 'A' && str.charAt(i) < 'Z'){
                countWords++;
                eachWord += "\n"+ str.charAt(i) ;
            }else {
                eachWord += str.charAt(i);
            }
        }
        eachWord = eachWord.substring(0,0+1).toUpperCase() + eachWord.substring(1);
        System.out.println(countWords);
        System.out.println(eachWord);
    }
}
