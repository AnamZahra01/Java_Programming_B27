package day49_functional_interface.driver;

public class ChromeDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Opening in Chrome");
    }

    @Override
    public void findElement() {
        System.out.println("Finding elements in Chrome");

    }
}
