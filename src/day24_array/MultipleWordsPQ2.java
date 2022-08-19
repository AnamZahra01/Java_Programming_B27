package day24_array;

public class MultipleWordsPQ2 {
    /*
    Multiple Words
	Given a String of words that are separate by comma and spaces. Find and print any words that have more than one word
	Example
		Input: knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer
		Output:     wooden spoons
			        trash can
			        dish washer
     */
    public static void main(String[] args) {
        String str = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] words = str.split(", ");
        String output = "";
        for(String eachWord : words) {
            if(eachWord.contains(" ")){
                output += eachWord + "\n";
            }
        }
        System.out.println(output);
    }
}
/*
ALGO:
    str to arr
    for each to read all elements of arr
    if -> arr[0].contains(" ")
 */