package AGroupPractice;

public class InterviewTask {

    public static void main(String[] args) {

        String str = "xAFndfxxfXXfxxxlkjx";
        String output ="";
        String output2 ="";

        for(int i = 1; i<= str.length()-1; i++){

            if(str.charAt(i)=='X'|| str.charAt(i)== 'x'){

              output= str.replaceAll("x","");
              output2 = output.replaceAll("X","");

            }
        }
     //  output2= output2.concat("x");
       output2 = str.substring(0,1) + output2 + str.substring(18,19);
        System.out.println(output2);
        System.out.println("===========================");



//        System.out.println(("xAFndfxxfXXfxxxlkjx"));
//        System.out.println(removeX(str));

        String last = str.substring(1, str.length() - 2).replace("x", "").replace("X","");
        String result = str.substring(0,1) + last + str.substring(str.length()-1);
        System.out.println(result);


    }


}
