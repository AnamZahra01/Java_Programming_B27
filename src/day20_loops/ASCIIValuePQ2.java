package day20_loops;

public class ASCIIValuePQ2 {
    /*
    Characters in String
    Given a String print the ascii value codes for each character
        Ex:
            Input:
                java
            Output:
                106 97 118 97

                 int value = 'j';  //ASCII value of j = 106
//        System.out.println(value);
     */
    public static void main(String[] args) {

        String str = "java";
                    //0123
        int value = 0;
        String storedValue = "";

        for (int i = 0; i < str.length(); i++ ){        //cycle,iteration   i -> 0,1,2,3              //java

          value = str.charAt(i);                                 //value just updates itself
          storedValue = storedValue + value + " ";                  //Strings can store values of all iterations

        }
        System.out.println(storedValue);
    }
}
