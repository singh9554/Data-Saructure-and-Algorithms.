package Queues;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.*;
public class Queue_Libraries {
public static void main(String []args){
    Queue <Integer> queue= new ArrayDeque<>();
    queue.offer(50);
    queue.offer(60);
    queue.offer(70);
    queue.offer(80);
    queue.offer(90);
    System.out.println(queue.poll());
    System.out.println(queue.peek());
    System.out.println(queue.size());
    System.out.println(queue.isEmpty());



}
}
