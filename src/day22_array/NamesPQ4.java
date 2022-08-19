package day22_array;

public class NamesPQ4 {
    /*
    Create a String array that has full names. Go through manually and print the initials of each name. Get each name(element) and use the String methods needed
    Ex: ["James Bonds", "Harry Potter", "Tony Stark"]
        JB
        HP
        TS
No loop yet
     */
    public static void main(String[] args) {
        String[] name = {"James Bonds", "Harry Potter", "Tony Stark"};

        String output1 = name[0].charAt(0)+""+ name[0].charAt(name[0].indexOf(" ")+1);
        System.out.println(output1);

        String output2 = name[1].charAt(0) +"" +name[1].charAt(name[1].indexOf(" ")+1);
        System.out.println(output2);

        String output3 = name[2].charAt(0) + "" + name[2].charAt(name[2].indexOf(" ")+1);
        System.out.println(output3);
    }
}
