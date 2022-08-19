package day30_practice_wrapper;

public class ValidPasswordMethods {
    /*
   Valid Password
   Given a String password find out if it is a valid password
   Requirements:
       Must have at least 8 characters
       Must have at least 1 uppercase letter
       Must have at least 1 lowercase letter
       Must have at least 1 number
       Must have one of the follow special characters:
           ! @ # $ % ^ & *
    */
    public static String checkCharacters(String str){
       String output = "";
        if(str.length() >= 8){
            output = isValid(str);  //calling method
        }else {
            output =  "InValid: Password must have at least 8 characters";
        }
        return output;
    }

    public static String isValid(String password){
      String value = "";
        int countUpper = 0, countLower = 0,countNumber = 0,countSpecial = 0;

      for(int i = 0; i < password.length(); i++){
         if(Character.isUpperCase(password.charAt(i))){
             countUpper++;
         } else if(Character.isLowerCase(password.charAt(i))){
              countLower++;
          } else if(Character.isDigit(password.charAt(i))){
              countNumber++;
          } else {
              countSpecial++;
          }
      }

      if(countUpper > 0 && countLower > 0 && countNumber > 0 && countSpecial > 0){
          value = "Valid Password";
      } else {
          if(!(countUpper > 0)){
              value += "Password must have at least 1 uppercase letter -";
          }
          if(!(countLower > 0)){
              value += "Password must have at least 1 lowercase letter -";
          }
          if(!(countNumber > 0)){
              value += "Password must have at least 1 number -";
          }
          if(!(countSpecial > 0)){
              value += "Password must have at least 1 special character -";
          }
      }
        return  value;
    }

    public static void main(String[] args) {
        System.out.println(checkCharacters("Pa"));
        System.out.println(checkCharacters("pas&%125"));
        System.out.println(checkCharacters("PAS$125^"));
        System.out.println(checkCharacters("Pa$*#@Pa"));
        System.out.println(checkCharacters("Pa1254Pa"));
        System.out.println(checkCharacters("Pa$125Pa")); //valid
        System.out.println(checkCharacters("password"));
        System.out.println(checkCharacters(""));
    }

}
