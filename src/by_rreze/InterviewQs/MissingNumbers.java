package by_rreze.InterviewQs;

import java.util.ArrayList;
import java.util.List;

public class MissingNumbers {
    //Lets say 1 to 10,
    //1,2,3,4,5,6,7,8,9,10
    //missingNumbers({1,2,3,5,7,9,10)
    //it should return -> {4,8}
    public static void missingNumbers(int[] array){ //2
        List<Integer> output = new ArrayList<>();

        for(int i = 1; i <= 10; i++){ // 1:10
            int count = 0;
            for(int j = 0; j < array.length; j++ ) { //  1,2,3,5,7,9,10

                if (i == array[j]) {
                    count++;
                }
            }
            if(count==0){
                output.add(i);
            }
        }System.out.println("output = " + output);
    }
    public static void main(String[] args) {
       int [] arr = {1,2,3,5,7,9,10};
        missingNumbers(arr);
    }
}
