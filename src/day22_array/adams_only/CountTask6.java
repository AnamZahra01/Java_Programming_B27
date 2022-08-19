package day22_array.adams_only;

public class CountTask6 {
    /*
    Count upper, lower, and numbers


					        Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.

					        Input: 2juMp41EEkd4s4

					        Output:
					        3 uppercase letters   result : MEE
					        6 lowercase letters   result : jupkds
					        5 numbers             result : 24144
     */
    public static void main(String[] args) {
        String str = "2juMp41EEkd4s4";
       
        int countNumber = 0;
        int countLowerCase = 0;
        int countUpperCase = 0;
        String num = "";
        String lowerCase = "";
        String upperCase = "";

        for(int i = 0; i < str.length(); i++){
            
            if (str.charAt(i) > '0' && str.charAt(i) < '9' ){
                countNumber++;
                num += str.charAt(i);
            } else if (str.charAt(i) > 'a' && str.charAt(i) < 'z') {
                countLowerCase++;
                lowerCase += str.charAt(i);
            }else if(str.charAt(i) > 'A' && str.charAt(i) < 'Z'){
                countUpperCase++;
                upperCase += str.charAt(i);
            }

        }
        System.out.println(countNumber);
        System.out.println(countLowerCase);
        System.out.println(countUpperCase);
        System.out.println(num);
        System.out.println(lowerCase);
        System.out.println(upperCase);
    }
}
