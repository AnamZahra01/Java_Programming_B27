package by_rreze.week4;

public class SumOfString {
    //2.String -- sum of digits in a string
//Write a method that can return the sum of the digits in a string

    public static void main(String[] args) {

        System.out.println(sumOfString("12a34b5c"));
        System.out.println(sumOfString("15a35b55c"));

    }
    public static int sumOfString(String str){

        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(str.charAt(i) + "");
            }
        }
        return sum;
    }
}

//String q = new String("17");
//int r = Integer.parseInt(q);

//Integer.parseInt -> converts String into int
//Character.isDigit() -> to check if Char is digit or not?