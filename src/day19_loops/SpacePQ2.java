package day19_loops;

public class SpacePQ2 {
    /*
    Space program
Given a String return a version of with spaces between all of the letters.
If there is already a space in the String put an underscore
	Ex: java	-> j a v a
		space 	-> s p a c e
		more words -> m o r e _ w o r d s

     */
    public static void main(String[] args) {
        String word = "java fun";
        String space = " ";


        for (int i= 0; i < word.length(); i++){       // i = 0,1,2,3

            if (word.contains(" ")){
                word =  word.replace(" " , "_");
            }
            space += word.charAt(i) + " ";
        }
        System.out.print(space);

    }
}
