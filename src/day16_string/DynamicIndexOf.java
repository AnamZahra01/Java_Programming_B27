package day16_string;

public class DynamicIndexOf {
    public static void main(String[] args) {

        String str = "definition";
        //            0123456789
        //goal is to find all the indexes of all the i characters.

        System.out.println("First i: " + str.indexOf('i'));
        System.out.println("Last i: " + str.lastIndexOf('i'));

        System.out.println("other use of indexOf: ");
        System.out.println("First i: " + str.indexOf('i'));
        System.out.println("Second i: " + str.indexOf('i',4)); // 4 is the starting point
        System.out.println("Second i: " + str.indexOf('i',6));

        System.out.println("Hard coded above ----- Dynamic below");

        int firstI = str.indexOf('i');
        int secondI = str.indexOf('i', firstI+1); // take previous index and add 1 to it, so we can start looking for the next occurrence
        int thirdI = str.indexOf('i', secondI+1);

        System.out.println("" + firstI + secondI + thirdI);

        System.out.println("--------------------------------");

        String str1 = "mississippi";
        //             012345678910
        int firstI1 = str1.indexOf('i');
        int secondI1 = str1.indexOf('i', firstI1+1); // take previous index and add 1 to it, so we can start looking for the next occurrence
        int thirdI1 = str1.indexOf('i', secondI1+1);
        int forthI1 = str1.indexOf('i', thirdI1+1);

        System.out.println("" + firstI1 + secondI1 + thirdI1 + forthI1);

        System.out.println("--------------------------------");

        String a = "hello";
        //          01234
        System.out.println(a.substring(1));
        System.out.println(a.substring(3));
        System.out.println(a.substring(0,3)); // excluding 3
        System.out.println(a.substring(2,5));
        System.out.println();

        String s = "infinity";
        //          01234567
        System.out.println(s.substring(0));
        System.out.println(s.substring(3));
        System.out.println(s.substring(5));
      //  System.out.println(s.substring(9)); //index 9 is not valid, so it stops the program.
        System.out.println(s.substring(8)); // program runs, shows nothing
        System.out.println(s.substring(1,6));
        System.out.println(s.substring(3,8));
       // System.out.println(s.substring(3,9)); // gives error





    }
}
