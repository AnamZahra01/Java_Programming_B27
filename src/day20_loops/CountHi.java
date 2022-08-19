package day20_loops;

public class CountHi {
    public static void main(String[] args) {

        String s = "abhimfjhicvgdhigbdj";

        int count = 0;

        while(s.contains("hi")){
            System.out.println(s);
            count++;
            s = s.replaceFirst("hi", ""); //deletes hi
        }
        System.out.println(count);


        System.out.println("---------------\n2nd Method:");
        //Approach#2: using indexes to check for every 2 characters

        String s2 = "abhimfjhicvgdhigbdj";
        int count1 = 0;
        for (int i = 0 ; i < s.length() -1; i++){   //abhimfjhicvgdhigbdj

                if ((s2.charAt(i) == 'h') && (s2.charAt(i+1)=='i')) {
                    count1++;
                    System.out.println(s2);
                    s2 = s2.replaceFirst("hi", "");

                }
        }
        System.out.println(count1);
        System.out.println(s2);

        System.out.println("---------------");
        //Approach#3: using indexes to check every 2 char

        int count3 = 0;
        String s3 = "abhimfjhicvgdhigbdj";

        for (int i = 0; i < s3.length() - 1; i++ ){

            if(s3.substring(i,i+2).equals("hi")){
                count3++;
            }
        }

        System.out.println(count3);


    }
}
