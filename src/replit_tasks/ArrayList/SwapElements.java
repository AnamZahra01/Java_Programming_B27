package replit_tasks.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SwapElements {


    public static ArrayList<String> swap(ArrayList<String> list,int pos1,int pos2) {

        ArrayList<String> output = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){

            if(i == pos1){
                output.add(pos1, list.get(pos2));
            } else if(i == pos2){
                output.add(pos2, list.get(pos1));
            } else{
                output.add(list.get(i));
            }
        }
        return output;
    }

    // Do not touch below
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int pos1 = in.nextInt();
        int pos2 = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }
        System.out.println(swap(list, pos1, pos2));
    }
}
