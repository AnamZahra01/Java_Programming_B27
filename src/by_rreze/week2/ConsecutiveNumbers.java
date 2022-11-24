package by_rreze.week2;

import java.util.Scanner;

/*
3.Numbers -- print consecutive numbers
Write a function:

that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
======================================
//number divisible by 2 -> Codility
    //3 -> Test
    //5 -> Coders
    // 2 & 3 ->  CodilityTest
    //2,3 and 5 -> CodilityTestCoders.
For example, here is the output for N = 24:
1
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
Codi1ityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
17
 */
public class ConsecutiveNumbers {

    public static void consecutiveNums(int num){

        int [] arr1 = {5*3*2, 5*3, 5*2, 3*2, 5, 3, 2};
        String [] arr2 = {"CodilityTestCoders", "TestCoders", "CodilityCoders","CodilityTest","Coders", "Test", "Codility"};
            for(int i = 1; i <= num; i++){ //1,2,3
                for(int j = 0; j < arr1.length; j++){ // 0-6

                    if(i % arr1[j] == 0) {
                System.out.println(i +" " + arr2[j]);
                break;
            }
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        consecutiveNums(number);
    }
}
