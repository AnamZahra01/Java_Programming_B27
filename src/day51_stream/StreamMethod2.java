package day51_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod2 {
    public static void main(String[] args) {

        //primitive array to list
        int[] arr = {3,4,1,5,15,4};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        /*
        Arrays.stream(arr) --> convert the array to stream(int)
        .boxed() --> converts data from int to integer -> result is
        Stream<Integer>

         */
        //list to array
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3,5,1,5,5,12,5,2));
        int[] arr2 = list2.stream().mapToInt(n-> n).toArray();


        /*
        list2.stream() --> converts list to Stream<Integer>
        .mapToInt(n -> n) --> converts each number into Int type
        if it was a method --> public static int mapToInt(Integer i){
        return (int)i;
        }


         */

        List<Integer> list3 = new ArrayList<>(Arrays.asList(3,5,1,5,5,12,5,2));
        System.out.println(list3.stream().map(n -> n * 2).collect(Collectors.toList())); //[6, 10, 2, 10, 10, 24, 10, 4]





    }
}
