import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class LinkedListQueueTester {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Tom");
        queue.add("Jane");
        queue.add("Beth");
        queue.add("John");
        queue.add("Mary");


        System.out.println("Queue is empty:"+ queue.isEmpty());
        System.out.println("Number of items in the queue is:"+ queue.size());
        System.out.println("Head of queue is:"+ queue.peek());
        String removedItem= queue.remove();
        System.out.println("Remove: "+ removedItem);


        //step 5
        System.out.println("Queue is empty:"+ queue.isEmpty());
        System.out.println("Number of items in the queue is:"+ queue.size());
        System.out.println("Head of queue is:"+ queue.peek());


        //step 6
        String removedItem2= queue.remove();
        System.out.println("Remove: "+ removedItem2);
        System.out.println("The head of the queue is: " + queue.peek());


        //Step 7
        String removedItem3= queue.remove();
        System.out.println("Remove: "+ removedItem3);
        System.out.println("The head of the queue is: " + queue.peek());


        //Step 8
        String removedItem4= queue.remove();
        System.out.println("Remove: "+ removedItem4);
        System.out.println("The head of the queue is: " + queue.peek());


        //Step 9
        String removedItem5= queue.remove();
        System.out.println("Remove: "+ removedItem5);
        System.out.println("Queue is empty:"+ queue.isEmpty());
        System.out.println("The head of the queue is: " + queue.peek());



        //Step 10
        System.out.println("Queue is empty: "+ queue.isEmpty());






















    }
}
