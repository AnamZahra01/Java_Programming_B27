package day39_inheritance.library;

public class library {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.author = "James Clear";
        book1.title = "Atomic Habits";
        //book1 has access to all 6 variables from Book Class;

        AudioBook book2 = new AudioBook();
        book2.duration = 45.20;
        book2.narrator = "James Bond";
        book2.hasMovie = true;
        //book2 has access to all 6 variables from Book Class + 2 variables from its own AudioBook class

        EBook book3 = new EBook();
        book3.size = 24.3;
        book3.onKindle = true;
        //book3 has access to all 6 variables from Book Class + 2 variables from its own EBook Class


    }
}

//don't make object of parent class -> not appreciated
