package day22_array.adams_only;

public class Task3 {
    /*
    Assume that you searched a word in Google  Search Engine.After that you took a result message like this
						 "About 640,000,000 results (0.78 seconds)"
						 According to this result print out search Time and number of Result
						 Input :  "About 640,000,000 results (0.78 seconds)"
						 Output:
						 			Result number is 640,000,000
						 			Response time is 0.78 seconds
     */
    public static void main(String[] args) {

        String str = "About 640,000,000 results (0.78 seconds)";

        String resultNumber = str.substring(str.indexOf(" "),str.indexOf(" r"));
        String responseTime = str.substring(str.indexOf("(")+1,str.indexOf(")"));

        System.out.println("Result number is " + resultNumber);
        System.out.println("Response time is " + responseTime);
    }
}
