package self_study;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfEachElement {

     /*
    Given the array return the output
                testArray = {"Apple","Banana","Apple","Cherry"}
                Output Example
                Apple = 2
                Banana = 1
                Cherry = 1
     */

    public static Map<String ,Integer> frequencyOfElements(String...arr){
        Map<String ,Integer> map = new LinkedHashMap<>();

        for(int i = 0; i  < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) +1);
            }else {
                map.put(arr[i],1);
            }
        }

        return map;
    }
    public static void main(String[] args) {
        System.out.println(frequencyOfElements("Apple", "Banana", "Apple", "Cherry"));
    }
}
