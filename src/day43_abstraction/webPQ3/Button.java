package day43_abstraction.webPQ3;

/*
create a class Button

    implement the WebElement & Clickable interface
    override all abstract methods
 */
public class Button implements WebElement, Clickable {
    @Override
    public void getText() {
        System.out.println("Getting Text");
    }

    @Override
    public void click() {
        System.out.println("Clicking");
    }

}
