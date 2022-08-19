package replit_tasks.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Nanuk {
    public static boolean hunt(ArrayList<String> result, int wayStones, int boast) {

        int countNanuk = 0, countResult = 0;
        for(int i = 0; i < result.size(); i++){
            if(result.get(i).equals("nanuk")){
                countNanuk++;
            }else {
                countResult += Integer.parseInt(result.get(i));
            }
        }
        if(countResult >= boast && wayStones >= countNanuk){
            return true;
        }
        return false;
    }
    // Do not touch below
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 5;   //in.nextInt();
        int stones = 2; //in.nextInt();
        int boast = 7;    //in.nextInt();
        ArrayList<String> list = new ArrayList<>();
      //  for(int i=0; i < size; i++) {

            list.add("1");
        list.add("10");
            list.add("3");
        list.add("nanuk");
        list.add("nanuk");
        list.add("nanuk");

        //}
        System.out.println(hunt(list, stones, boast));
    }
}
