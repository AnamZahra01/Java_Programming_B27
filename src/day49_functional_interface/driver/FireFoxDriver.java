package day49_functional_interface.driver;

public class FireFoxDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Opening in FireFox");

    }

    @Override
    public void findElement() {
        System.out.println("Finding elements in FireFox");

    }
}
