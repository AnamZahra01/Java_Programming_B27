package day29_methods;

public class FrequencyOfCharacter {
/*
    Ex:         Input:apple, p      Output:2
    Ex:         Input:apple, z      Output:0
    Ex:         Input:aabbaacca, a  Output: 5
 */

    public static int frequencyOfChar(String str, char letter){
        int count = 0;
        for(int i = 0; i  < str.length(); i++){
            if(str.charAt(i) == letter){
                count++;
            }
        }
    return  count;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChar("java", 'a'));
        System.out.println(frequencyOfChar("apple", 'p'));
        System.out.println(frequencyOfChar("mississippi", 'i'));
    }
}
