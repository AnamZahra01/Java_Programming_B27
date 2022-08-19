package replit_tasks.ArrayList;

import java.util.ArrayList;

public class Search {
    public static String search(ArrayList<String> strs, String find) {
        // complete the method

        for(String each : strs) {
            if (each.contains(find)) {
                return each;
            }
        }
                return  "search failed";
    }
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        int size = 3;   //in.nextInt();
        String find = "tw";  //in.next();
       // in.nextLine();
        ArrayList<String> list = new ArrayList<>();
       // for(int i=0; i < size; i++) {
            list.add(0, "one apple");
           list.add(0, "two oranges");
           list.add(0, "three bananas");

        //}
        System.out.println(search(list, find));
    }

}
