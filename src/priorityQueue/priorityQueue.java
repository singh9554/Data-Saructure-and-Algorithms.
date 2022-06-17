package priorityQueue;
import java.util.*;
public class priorityQueue {
    public static void main(String[]args){
//        PriorityQueue<String> pq=new PriorityQueue<>();
//        pq.offer("kiwi");
//        pq.offer("Banana");
//        pq.offer("Apple");
//        pq.offer("Mango");
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.offer(45);
        pq.offer(1);
        pq.offer(100);
        pq.offer(30);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }
}
