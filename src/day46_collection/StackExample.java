package day46_collection;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>(); // LIFO
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack); //[a, b, c]

        System.out.println("At the top " + stack.peek()); // checks whats at the top of the stack -> At the top c
        stack.pop(); // removes the element at the top of the stack and returns it
        System.out.println("At the top now " + stack.peek()); //At the top now b
        System.out.println(stack); //[a, b]

        System.out.println(stack.pop() + " was removed from the stack"); //b was removed from the stack
        System.out.println(stack); //[a]

        // I can use the methods from List , but for stack I want to use the function of LIFO
        System.out.println(stack.get(0)); //a
        stack.add("h");
        System.out.println(stack); //[a, h]


    }

}
