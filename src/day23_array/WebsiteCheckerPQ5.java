package day23_array;

public class WebsiteCheckerPQ5 {
    /*
    Website checker
	Given some urls determine how many .com, .org, and .edu websites there are. Also keep track of an ‘other’ category for websites that have a different domain
Sample websites for an array:
bing.com, wikimedia.org, twitter.com, amazonaws.com, japanpost.jp, mysql.com, nasa.gov, linkedin.com, ucla.edu, github.io, spotify.com, mozilla.org, nba.com, comcast.net, tamu.edu, utexas.edu
ALGO:
Str:
count: .com, .org, .edu,
count others: .io, .net, .gov, .jp
 */
    public static void main(String[] args) {
        String[] str = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com", "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozill.org", "nba.com", "comcast.net", "tamu.edu", "utexas.edu"};
        System.out.println(str.length); //16 -> counting number of elements[size] in array str.
        System.out.println(str[0].length()); //8 -> count the characters of 1st element of array str at index 0.
        int countDotCom = 0;
        int countDotOrg = 0;
        int countDotEdu = 0;
        int countOther = 0;


        for(int i = 0; i < str.length; i++ ){

            if(str[i].contains(".com")){
                countDotCom++;
            } else if(str[i].contains(".org")){
                countDotOrg++;
            } else if (str[i].contains(".edu")){
                countDotEdu++;
            } else {
                countOther++;
            }
        }
        System.out.println("com: " + countDotCom);
        System.out.println("edu: " + countDotEdu);
        System.out.println("org: " + countDotOrg);
        System.out.println("Others: " + countOther );
    }
}
