package day20_loops;

public class SpaceProgram {
    public static void main(String[] args) {
        /*
        algo: Take String letter one by one and put space between it.
              Repeating pattern
         */
        String  s = "java is fun";
        String result = "";

        for(int i = 0; i < s.length(); i++){     // checks every index
            char letter = s.charAt(i) ;

            if(letter == ' '){
                result += "_";                  //replace or make String to concatenate
            } else {
                result += letter + " ";
            }
        }

        System.out.println(result.trim());
    }
}
