package day36_custom_classes.song;

public class SongObject {
    public static void main(String[] args) {

        Song song1 = new Song("Coldplay", 3.5, "Clocks", "Pop");
        System.out.println(song1);

        Song song2 = new Song("Four Season", 2.8);
        System.out.println(song2);

        Song song3 = new Song(3.0, "Hello");
        System.out.println(song3);
    }
}
