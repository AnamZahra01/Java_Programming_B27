package day16_string;

public class PQ7 {
    /*
[SMS parts] - We will do this together
Given a String in the following format:
Sender: <James Bond>. From Number: [202-123-3456]. + Message: {"I love programming and problem solving"}
Separate these parts and print them separately:
    Sender: actualSender
    Number: actualNumber
    Message: actualMessage
     */
    public static void main(String[] args) {
        String format = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {\"I love programming and problem solving\"}";
        System.out.println(format);

        int startName = format.indexOf('<');
        int endName = format.indexOf('>');
        String name = format.substring(startName + 1, endName);
        System.out.println("Sender: " +name);

        int startNum = format.indexOf('[');
        int endNum = format.indexOf(']');
        String num = format.substring(startNum + 1, endNum);
        System.out.println("Number: " +num);

        int startMessage = format.indexOf('{');
        int endMessage = format.indexOf('}');
        String message = format.substring(startMessage + 1, endMessage);
        System.out.println("Message: " +message);


    }
}
