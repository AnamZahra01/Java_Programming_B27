package day43_abstraction.bookPQ2;

/*
Create an abstract class EBook
    - Inherits Book and implements Downloadable
    - Declare a size variable
    - Declare an abstract methods:
        open()
 */
public abstract class EBook extends Book implements Downloadable {
    double size;
    public EBook(String name, double size){
        super(name);
        this.size = size;
    }
    public abstract void open();
}
