package day46_collection;

import java.util.*;

public class QueueExamples {
    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(3);
        queue.add(10);
        queue.add(8);
        queue.add(2);
        System.out.println(queue); //[2, 3, 8, 10]

        System.out.println(queue.peek()); //2 -> get
        System.out.println(queue.poll()); //2 -> remove

        System.out.println(queue); //[3, 10, 8]
        System.out.println(queue.peek()); //3 -> get
        System.out.println(queue.poll());//3 -> remove
        System.out.println(queue); // [8, 10]


        System.out.println("---------------------------");

        ArrayDeque<String> queue2 = new ArrayDeque<>();
        queue2.offer("java"); // offer just adds to the queue -> could use add()
        queue2.offer("tuesday");
        queue2.offer("soft skills");
        queue2.offer("automation");

        System.out.println(queue2); //[java, tuesday, soft skills, automation]
        System.out.println(queue2.peek()); // the other method to use is element() -> java

        System.out.println(queue2.poll()); // the other method to use is remove() -> java
        System.out.println(queue2); //[tuesday, soft skills, automation]

        System.out.println(queue2.peek()); //tuesday

        System.out.println(queue2); //[tuesday, soft skills, automation]

        queue2.offerFirst("API"); // method from Deque -> add
        System.out.println(queue2); //[API, tuesday, soft skills, automation]


//        queue2.add(null); null is not allowed in queue types
        queue2.pollLast(); //delete last element
        System.out.println(queue2); //[API, tuesday, soft skills]


//        new ArrayDeque<>().remove(); // causes exception
//        new ArrayDeque<>().poll(); // returns null, but no exception

        List<Integer> list = new LinkedList<>();
        ((Deque)list).offerFirst(4);
        ((Deque)list).offerFirst(5);
        ((Deque) list).offerLast(7);
        System.out.println(list);


    }

}
