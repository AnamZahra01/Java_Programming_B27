package day21_nested_loops;

public class IQPQ3 {
    /*
    [IQ] Duplicate characters
    Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.
    Ex:
        Input:
            AAABCCDEEF
        Output:
            ACE
        -> the characters A C and E are found in the String multiple times, so they are duplicates
    variations:
        Write a program that can return the first duplicated character from a string
        Write a program that can return the index number of the first unique character.
     */
    //for each iteration of outer loop, inner loop goes from beginning to end
    public static void main(String[] args) {

        String str = "AAABCCDEEF";
        System.out.println("word: " + str);

        String uniqueLetters = "";
        String duplicateLetters= "";

        outer: for (int i = 0; i < str.length(); i++) {

            if (!duplicateLetters.contains("" + str.charAt(i))) {

                int count = 0;
               inner: for (int j = 0; j < str.length(); j++) { //str

                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                if(count > 1){ //repeated
                    duplicateLetters += str.charAt(i);
                }
              else if (count == 1){
                      uniqueLetters += str.charAt(i);
               }

            }
        }
        if (duplicateLetters == ""){
            System.out.println("Duplicates: Null");
        }else {
            System.out.println("Duplicates: " + duplicateLetters);
            System.out.println("First repeating character: " + duplicateLetters.charAt(0));
        }

        if (uniqueLetters == ""){
            System.out.println("Uniques: Null");
        }else {
            System.out.println("Uniques: " + uniqueLetters);
            System.out.println("Index of first unique character: " + str.indexOf(uniqueLetters.charAt(0)));
        }
    }
}
/*
ALGO:
String check = ""; -> stores all characters once. G=1; A is counted, do not go for A again
outer:for(to get each letter)

if(check does not contain this character, then repeat) -> DRY
initialize counter = 0; -> tells frequency of each letter in str
inner:for(to get Str from beginning to end)

if(outer loop(index)== inner loop (index) )
counter++
check = index of outer loop (stores current value only)

if(counter more than 1) -> duplicated letter

 variations:
        Write a program that can return the first duplicated character from a string
Additional Tasks:
String duplicatedChar -> to store all repeating characters from check string. check holds char,not String
 */