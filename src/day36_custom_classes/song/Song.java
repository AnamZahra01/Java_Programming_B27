package day36_custom_classes.song;

public class Song {
    String name, artist, genre;
    double length;

    public  Song(String name, double length){
        this.name = name;
        this.length = length;
    }
    public  Song( double length, String name){
        this.name = name;
        this.length = length;
    }

    public Song(String name, double length, String artist,  String genre){
        this.name = name;
        this.length = length;
        this.artist = artist;
        this.genre = genre;

    }

    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", length=" + length +
                '}';
    }
}
