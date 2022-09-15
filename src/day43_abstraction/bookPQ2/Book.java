package day43_abstraction.bookPQ2;
/*
Create an abstract class Book
    - Declare a name variable
    - Declare an abstract methods:
        read();
 */
public abstract class Book {
    String name;
    public Book(String name) {
        this.name = name;
    }

    public abstract void read();
}
