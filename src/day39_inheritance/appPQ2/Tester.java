package day39_inheritance.appPQ2;

public class Tester {
    public static void main(String[] args) {
        Instagram obj1 = new Instagram("Anam", 20);
        System.out.println(obj1);
        System.out.println(obj1.name);
        obj1.postPicture();
        obj1.download();

        YouTube obj2 = new YouTube("Zagham", 21);
        System.out.println(obj2);
        obj2.watchVideo();
        obj2.download();

    }
}
