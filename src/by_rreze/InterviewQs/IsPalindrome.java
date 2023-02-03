package by_rreze.InterviewQs;

public class IsPalindrome {

    public static void isPalindrome(int num) {
        int reversedNum = 0;
        int temp = num;

        while (num > 0) {
            int unitPlace = num % 10;                   //121%10 = 1,    // 12%10 = 2     // 1
            reversedNum = reversedNum*10 + unitPlace; // 0+1=1       //  (1*10)+1 =11   //11*10 + 11 =121
             num = num / 10;                              //121/10 = 12,   // 12/10 = 1     //

        }
        if(temp==reversedNum){
            System.out.println( temp+" and " +reversedNum + " = palindrome number");
        }else {
            System.out.println(temp + " and " + reversedNum + " = not palindrome");
        }
    }

    public static void main(String[] args) {
        isPalindrome(121);
    }
}
