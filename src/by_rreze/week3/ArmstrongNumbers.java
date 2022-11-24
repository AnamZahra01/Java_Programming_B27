package by_rreze.week3;

public class ArmstrongNumbers {
    public static void armstrongNum(int num){
        int num1 = num % 10; //3
        int num2 = num / 10; //15
        int num3 = num2 % 10; //5
        int num4 = num2/10; //1
        int output = (int)(Math.pow(num1, 3) + Math.pow(num3, 3) + Math.pow(num4, 3));
        System.out.println((num == output) ? "Armstrong" : "Not Armstrong");
    }
    public static void main(String[] args) {
        armstrongNum(153);
        armstrongNum(1);
        armstrongNum(100);
    }
}
