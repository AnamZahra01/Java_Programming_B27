package by_rreze.checkCodes;

public class ReturnWord {


        public static void main(String[] args) {
            System.out.println(getword("aaaabbcccdda")); }
        public static String getword(String word) {
            int count=1;
            String ret="";
            for (int i = 0; i < word.length()-1; i++) {
                if(word.charAt(i)==word.charAt(i+1)) { count++;
                    continue;
                }else {
                    ret=ret+word.charAt(i)+count; }
                count=1; }
            ret=ret+word.charAt(word.length()-1);
            return ret; }

}
