package day26_multi_array;

import java.util.Arrays;
import java.util.Scanner;

public class PQ4 {
    /*
    We did the group task together, try to make it completely dynamic with Scanner inputs. Ask the number of groups, the number of people in group1, group2, group3, etc... and ask for the name of each person on the group and assign into the array
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of groups: ");
        int rows = input.nextInt();     //array size  -> NumOfRows or NumOfElements

        String[][] arr= new String[rows][] ;
       outer: for(int i = 0; i < rows; i++){  //rows = arr.length

            System.out.print("Enter number of students in group " + (i+1) +": ");
            int  columns= input.nextInt();   //inner element length
            input.nextLine();    //handle enter input
            arr[i]= new String[columns] ; //imp: row 1 has 2 columns ( if user enter 2 in line 19)

           inner:  for(int j = 0; j < columns; j++){

              System.out.print("Enter name of student " + (j+1) +": ");
                arr[i][j] = input.nextLine();
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
