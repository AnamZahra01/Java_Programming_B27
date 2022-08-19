package day23_array;

public class ShortestLongestPQ4 {
    /*
    Shortest and Longest words from String array

	• Write a program that can return the shortest string element from a String array
	• Write a program that can return the longest string element from a String array
     */
    public static void main(String[] args) {

        String[] str = {"Java", "Cydeo","Python"};
                        // 0   ,  1,        2
        String shortest = str[0];
        String longest = str[0];

        for (int i = 0; i < str.length; i++) {

            if(str[i].length() > longest.length()){
                longest = str[i];
            } else{
                shortest = str[i];
            }
        }
        System.out.println("Longest: " + longest);
        System.out.println("Shortest: " + shortest);

    }
}
