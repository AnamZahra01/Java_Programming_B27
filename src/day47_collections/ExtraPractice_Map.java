package day47_collections;

import java.util.*;

public class ExtraPractice_Map {
    public static void main(String[] args) {

        Map<Integer,String> map1 = new HashMap<>(); //Random , accept Null
        map1.put(10, "Zainab"); // put(key, value) to provide key and value
        map1.put(1,"Asim");
        map1.put(120,"Asim");
        map1.put(14,"Dawar");
        map1.put(null, null);
        map1.put(null, "hey");
        System.out.println(map1.size()); //5 pairs
        System.out.println(map1); //{null=hey, 1=Asim, 120=Asim, 10=Zainab, 14=Dawar}
        System.out.println(map1.get(14)); //get(enter key) -> get value Dawar
        map1.replace(120, "Madi");
        map1.remove(null); //enter key to remove key + value
        System.out.println(map1.containsKey(120)); //true
        System.out.println(map1.containsKey(122)); //false
        System.out.println(map1.containsValue("James")); //false
        System.out.println(map1.isEmpty()); //false
        map1.clear();

        System.out.println(map1);
        System.out.println();

        System.out.println("===============");

        Map<Integer,String> map2 = new LinkedHashMap<>(); //maintain insertion order, null allowed in linked hash map
        map2.put(10, "Zainab");
        map2.put(1,"Asim");
        map2.put(120,"Asim");
        map2.put(14,"Dawar");
        map2.put(null, null);

        for(Integer eachKey : map2.keySet() ){ //to get each key
            System.out.println(eachKey);
        }
        System.out.println();

        for(String eachValue : map2.values()){ //to get each value
            System.out.println(eachValue);
        }
        System.out.println("==============");
        for(Map.Entry<Integer,String> eachEntry :  map2.entrySet()){
           System.out.println(eachEntry);
          //  System.out.println(eachEntry.getKey());
           // System.out.println(eachEntry.getValue());
        }
        System.out.println("-----------------");

        System.out.println(map1.equals(map2)); //false
        System.out.println(map2);


        Map<Integer, String> map3 = new Hashtable<>(); //No order, no null, sync only
        map3.put(10, "Zainab");
        map3.put(1,"Asim");
        map3.put(120,"Asim");
        map3.put(14,"Dawar");
      //  map3.put(null, null);

        System.out.println(map3);

        Map<Integer,String> map4 = new TreeMap<>(); //ascending order of keys, null rejected in tree map

        map4.put(10, "Zainab");
        map4.put(1,"Asim");
        map4.put(120,"Asim");
        map4.put(14,"Dawar");
    //    map4.put(null, null);

        System.out.println(map4);

    }
}
