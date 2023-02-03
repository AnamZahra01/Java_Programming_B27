package by_rreze.InterviewQs;

public class ValidParanthesis {
        public static boolean isValid(String s) {


                char [] arr= s.toCharArray();

                for(int i = 0; i < arr.length; i= i+2){

                    switch (arr[i]){
                        case '(':
                            if(arr[i+1] == ')'){
                                return true;
                            }
                            break;

                        case '{':
                            if(arr[i+1] == '}'){
                                return true;
                            }
                            break;
                        case '[':
                            if(arr[i+1]==']'){
                                return true;
                            }
                            break;
                    }

                }
                return false;
        }


        public static boolean isValid2(String s) {

            char [] arr = s.toCharArray();
            if(arr.length%2 != 0){
                return false;
            }
            boolean isPair=false;
            for(int i = 0; i < arr.length-1; i=i+2){
                if(arr[i] == '(' && arr[i+1] == ')'){
                    isPair= true;
                }else if(arr[i] == '{' && arr[i+1] == '}'){
                    isPair= true;
                }else if(arr[i] == '[' && arr[i+1] == ']'){
                    isPair= true;
                }else {
                    return false;
                }
            }
           return isPair;
        }
    public static void main(String[] args) {
        String s1= "()"; //true
        String s2= "(){}[]"; //true
        String s3= "())";
        String s4= "(){][]";
        System.out.println(isValid2(s4));

    }

    public static boolean isValid3(String s) {

        if(s.length()%2 != 0){
            return false;
        }

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i-1) == '(' && s.charAt(i) == ')'){
                return true;
            }
            if(s.charAt(i-1) == '{' && s.charAt(i) == '}'){
                return true;
            }
            if(s.charAt(i-1) == '[' && s.charAt(i) == ']'){
                return true;
            }

        }
        return false;

    }


    public static boolean isValid4(String s) {
        if(s.length()%2 != 0){
            return false;
        }

        boolean isPair=false;
        for(int i = 0; i < s.length()-1; i++){

            if((s.charAt(i) == '(' && s.charAt(i+1) == ')')|| (s.charAt(i) == '{' && s.charAt(i+1) == '}') ||(s.charAt(i) == '[' && s.charAt(i+1) == ']') ){
                isPair= true ;
            }
            else {
                return false;
            }
        }
        return isPair;
    }



}
