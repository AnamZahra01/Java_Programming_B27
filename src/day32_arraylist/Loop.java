package day32_arraylist;

import java.util.ArrayList;

public class Loop {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(8);
        nums.add(7);
        nums.add(3);
        nums.add(4);

        //get(0) get(1) get(2)
        for(int i = 0; i < nums.size(); i++){
            System.out.print(nums.get(i) + " "); //4 8 7 3 4
        }
        System.out.println();

        for (int each: nums){
            System.out.print(each + " "); //4 8 7 3 4
        }
        System.out.println();
        System.out.println("-------------");

        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Iron Man");
        avengers.add("Spider Man");
        avengers.add("Thor");
        avengers.add("Captain America");
        avengers.add("Hawk-eye");

        //print each initial. Iron Man -> IM, Thor -> T
        for(String each : avengers){
            if (each.contains(" ")){
                int indexOfSpace = each.indexOf(" ") + 1;
                System.out.println(each.substring(0,1) + each.substring(indexOfSpace,indexOfSpace+1 ));
            }else {
                System.out.println(each.charAt(0));
            }
        }


    }
}
