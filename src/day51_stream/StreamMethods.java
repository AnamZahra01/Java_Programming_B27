package day51_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        //Create a Stream

        List<Integer> list1 = new ArrayList<>(Arrays.asList(3,4,6,12,5));
        list1.stream(); // creates the stream, but we need to do more
        System.out.println("list1 = " + list1.stream()); // hash code: java.util.stream.ReferencePipeline$Head@35f983a6

        int[] arr1 = {3,5,6,12,5};
        Arrays.stream(arr1); //made Stream from Array

        //distinct() : removes duplicates
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,1,2,1,2,3,4,5,6,6,7,6,5,4,2,4,1,5,7,4,2));
        System.out.println("list2 distinct() w/ list = " + list2.stream().distinct().collect(Collectors.toList())); //list2 = [1, 2, 3, 4, 5, 6, 7]
        System.out.println("list2 = " + list2); //list2 = [1, 1, 1, 2, 1, 2, 3, 4, 5, 6, 6, 7, 6, 5, 4, 2, 4, 1, 5, 7, 4, 2]

       // list2 = list2.stream().distinct().collect(Collectors.toList()); //reassign

        /*
        .stream() -> converts list to stream
        .distinct() -> removes duplicates from Stream
        .collect(Collectors.toList()) -> converts stream to List type

         */
        int[] arr2 = {1,1,1,2,1,2,3,4,5,6,6,7,6,5,4,2,4,1,5,7,4,2};
        arr2 = Arrays.stream(arr2).distinct().toArray();
        System.out.println("distinct() with array: "+Arrays.toString(arr2));


        //skip() -> removes/ skips n number of elements
        List<String> list3 = new ArrayList<>(Arrays.asList("summer", "bike", "fall", "raining", "pond", "lake", "fishing", "sun"));
        System.out.println(list3.stream().skip(3).collect(Collectors.toList())); //[raining, pond, lake, fishing, sun]
        System.out.println(list3.stream().skip(6).collect(Collectors.toList())); //[fishing, sun]
        System.out.println(list3.stream().skip(10).collect(Collectors.toList())); //[]
        System.out.println("----------------------");

        //limit(); keeps n number of elements
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list4.stream().limit(5).collect(Collectors.toList())); //[1, 2, 3, 4, 5]

        //using both limit() and skip()
        System.out.println(list4.stream().limit(6).skip(2).collect(Collectors.toList())); //[3, 4, 5, 6]
        System.out.println(list4.stream().skip(4).limit(4).collect(Collectors.toList())); //[5, 6, 7, 8]
        System.out.println("----------------------");

        //count(); how many elements/ data are in the stream
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,1,1,2,1,2,3,4,5,6,6,7,6,5,4,2,4,1,5,7,4,2));
        System.out.println(list5.stream().count()); //22
        System.out.println(list5.stream().distinct().count()); //7

        //task(); to find how many unique characters a String have
        String s = "aaaaabbbbbcccccddddeeeeeeffff";
        System.out.println(Arrays.stream(s.split("")).distinct().count()); //6
        System.out.println(Arrays.stream(s.split("")).distinct().collect(Collectors.toList())); //[a, b, c, d, e, f]





    }
}
