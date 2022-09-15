package day43_abstraction.bookPQ2;
/*
Create a concrete class JavaTextbook
    - Inherits EBook
    - Declare a fun variable
    - Override all abstract methods
 */
public class JavaTextBook extends EBook{
    boolean fun;
    public JavaTextBook(String name, double size, boolean fun){
        super(name,size);
        this.fun = fun;
    }

    @Override
    public void open(){
        System.out.println("Opening File");
    }

    @Override
    public void read(){
        System.out.println("Reading Book");
    }
    @Override
    public void download(){
        System.out.println("Book.pdf can be downloaded");
    }

}
