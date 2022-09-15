package day43_abstraction.webPQ3;
/*
create a class InputField
    implement the WebElement & Clickable & Input interfaces
    override all abstract methods
 */
public class InputField implements WebElement, Clickable, Input {
    @Override
    public void click() {
        System.out.println("Click using Field");
    }

    @Override
    public void sendKeys() {
        System.out.println("Send Keys using Field");
    }

    @Override
    public void getText() {
        System.out.println("Get Text using Field");
    }
}
