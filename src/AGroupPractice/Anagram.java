package AGroupPractice;

import java.util.*;

public class Anagram {

    //input : {"eat", "tea", "tam", "ate", "mat", "bat"}
    //output {{"bat"},{"mat","tam"},{"ate","eat","tea"}} --> map{{map},map,map}

  

    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();

       // List<String> list  = new ArrayList<>( Arrays.asList("eat", "tea", "tam", "ate", "mat", "bat")); //arr of String

        String [] arr = {"eat", "tea", "tam", "ate", "mat", "bat"};

        int index = 0;
        for(String each: arr){

            index++;
           char [] charArr =  each.toCharArray();
            Arrays.sort(charArr); //aet ,aet, atm, aet,
            System.out.println("charArray = " + Arrays.toString(charArr));
            map.put(index, Arrays.toString(charArr).replace(", ",""));
        }

        System.out.println(map);
        for(int i = 0; i < map.size(); i++){
            if(map.containsValue(map.get(i))){

                List<String >    list = new ArrayList<>();
                list.add(arr[i]);

            }


        }



    }


    }

