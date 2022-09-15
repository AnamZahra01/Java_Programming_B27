package day43_abstraction.webPQ3;
/*
create a class Link
    implement the WebElement & Clickable interface
    override all abstract methods
 */
public class Link implements WebElement, Clickable{
    @Override
    public void click() {
        System.out.println("Click using Link");
    }

    @Override
    public void getText() {
        System.out.println("Get Text using Link");
    }
}
