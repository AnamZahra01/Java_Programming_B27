package by_rreze.week2;
import java.util.*;
/*
find the nearestNumberInArray
ex: List<Integer> numbers = Arrays.asList(1,2,5,8,9,13,21,22,25,50);
 */
public class NearestNumberByRul {
    public static void nearestNum(int num, ArrayList<Integer> list){
        //Map<Integer,Integer> map = new LinkedHashMap<>();
        String output = "";
        int smallest = list.get(0);
        ArrayList<Integer> list1 = new ArrayList<>();
        //find difference
        for(int i = 0; i < list.size(); i++) {
            list1.add(Math.abs(num - list.get(i)));
              output = (list.get(i) < smallest)? "smallest: " + smallest : "Enter again";
        }
        System.out.println("output = " + output);
//
//        for(Map.Entry<Integer,Integer> each : map.entrySet()){
//
//            if(each.getValue() < int1){
//                int1 =  each.getKey();
//            }
//        }
        System.out.println(list1);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,5,8,9,13,21,22,25,50));
        Scanner input = new Scanner(System.in);
        nearestNum(input.nextInt(), list);
    }
}
