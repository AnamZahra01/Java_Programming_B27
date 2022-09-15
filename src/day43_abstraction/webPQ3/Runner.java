package day43_abstraction.webPQ3;

public class Runner {
    public static void main(String[] args) {

        InputField obj1 = new InputField();
        obj1.click();
        obj1.getText();
        obj1.sendKeys();
        System.out.println();

        Button obj2 = new Button();
        obj2.getText();
        obj2.click();
        System.out.println();

        Link obj3 = new Link();
        obj3.click();
        obj3.getText();

    }
}
