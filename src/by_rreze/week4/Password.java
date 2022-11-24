package by_rreze.week4;

//String -- Password Validation Task
//1. Write a return method that can verify if a password is valid or not.
//requirements:
//1. Password MUST be at least have 6 characters and should not contain space
//2. PassWord should at least contain one upper case letter
//3. PassWord should at least contain one lowercase letter
//4. Password should at least contain one special characters
//5. Password should at least contain a digit


public class Password {
    public static void main(String[] args) {

        String str = "abC12*3";
        if(!str.contains(" ") && str.length() >= 6 ){
            System.out.println(passwordValidation(str));
        }
        else {
            System.out.println("Change your password please");
        }
    }
    public static boolean passwordValidation(String password){
        int lowerCount = 0, upperCount = 0, digitCount = 0, specialChar = 0;

        for(int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isLowerCase(ch)) {
                lowerCount++;
            } else if (Character.isUpperCase(ch)) {
                upperCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                specialChar++;
            }
        }
        return lowerCount >= 1 && upperCount >= 1 && digitCount >= 1 && specialChar >= 1;
    }
}
