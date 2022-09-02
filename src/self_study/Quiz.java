package self_study;

public class Quiz {
//    int n = 10;
//    static int z = 20;
//
//    public static void main(String[] args) {
//        Quiz obj = new Quiz();
//        obj.z = 30;
//        Quiz obj2 = new Quiz();
//        obj2.n = 15;
//        System.out.println(obj2.n+" "+obj2.z);

   // }
//
//    boolean canBounce;
//    String color;
//
//    public static void main(String[] args) {
//        Quiz ball = new Quiz();
//        String color;
//        color = "red";
//        System.out.println(ball.color);
  //  }

//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        //System.out.println(list.containsAll(Arrays.asList("rain","season")));
//        //System.out.println(list.containsAll(Arrays.asList("The","storm")));
//
//        list.add("e");
//        list.add("3");
//        list.add("j");
//        list.add("1");
//        list.remove(1);
//        list.add("2");
//        list.add("i");
//        list.remove("2");
//        System.out.println(list);

    //}

//    static void run(){
//        System.out.println(1);
//    }
//
//    public static void main(String[] args) {
//        Quiz.run();
//        System.out.println(2);
//    }
//    public Quiz(){
//        System.out.println(3);
//    }
//    static {
//        System.out.println(4);
//    }
    static int count;
    public Quiz(){
        count++;
    }
    public Quiz(int i){
        count+=i;
    }
    public Quiz(String s){
        count+=s.length();
    }
}
class Test{
public static void main(String[]args){
new Quiz();
Quiz a = new Quiz();
Quiz a2 = new Quiz("fun");
Quiz a3 = new Quiz(2);
    System.out.println(Quiz.count);
        }
        }
