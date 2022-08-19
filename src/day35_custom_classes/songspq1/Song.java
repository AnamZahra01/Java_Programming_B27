package day35_custom_classes.songspq1;
/*
   create a class called Song
       - data:
           name, length, artist, genre
       - constructor
           - create a constructor that creates a Song object with the name, length, artist, and genre
       - method:
           toString()
               print all the Song information
   Create a separate class to create and test the Song objects
    */
public class Song {
    //instance variables
    String name, artist, genre;
    int length; //in seconds
    //constructor : local variables initialize instance variables
    public Song(String name, int length, String artist, String genre){
        this.name = name;
        this.length = length;
        this.artist = artist;
        this.genre = genre;
        lyrics();
    }
    public void lyrics(){

        if(name.equals("In the Name of Love")) {
            System.out.println("\nIf I told you this was only gonna hurt\n" + "If I warned you that the fire's gonna burn\n" + "Would you walk in?\n" + "Would you let me do it first?\n" + "Do it all in the name of love\n");
        } else if(name.equals("Scars to you beautiful")){
            System.out.println("\nThere's a hope that's waiting for you in the dark\n" + "You should know you're beautiful just the way you are\n" + "And you don't have to change a thing\n" + "The world could change its heart\n" + "No scars to your beautiful\n" + "We're stars and we're beautiful\n");
        }
    }
    //toString method
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length='" + length + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
