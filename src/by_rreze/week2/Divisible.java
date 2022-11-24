package by_rreze.week2;
/*
2. Numbers -- Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
ex:
OutPut:
Divisible By 15 15 30 45 60 75 90
Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */
public class Divisible {
    public static void divisible(){
        int [] arr = {15, 5, 3};

        for(int i = 0; i < 3; i++ ){
            String output = "Divisible by " + arr[i] +": ";

            for(int num = 1; num <= 100; num++) {

                if (num % arr[i] == 0) {
                    output += num + " ";
                }
            }
            System.out.println(output);
        }
    }
    public static void main(String[] args) {
        divisible();
    }
}
