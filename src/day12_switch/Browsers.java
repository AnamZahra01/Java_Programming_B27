package day12_switch;

public class Browsers {
    public static void main(String[] args) {

        String browser = "Chrome"; //chrome, firefox, safari
        String output = " ";
        switch (browser){
            case "chrome":
            case "Chrome":
            case "CHROME":
            case "firefox":
                output = "opening google in " +browser;
                break;
            case "safari":
            case "Safari":
                System.out.println("Special set up on apple computers");
                output = "opening google in " +browser;
                break;

            default:
                System.out.println("Opening in chrome default");
        }
        System.out.println(output);

    }
}
