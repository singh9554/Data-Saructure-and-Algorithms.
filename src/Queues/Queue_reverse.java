//Reversing A Queues;...................;
package Queues;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.*;
public class Queue_reverse {
    Queue<Integer> q1=new ArrayDeque<>();
    Queue<Integer> q2=new ArrayDeque<>();
    Deque<Integer> s=new ArrayDeque<>();
    void Enqueue(int data){
        q1.offer(data);
    }
    int Dequeue(){
        while(!q1.isEmpty()){
            s.push(q1.poll());

        }
        while(!s.isEmpty()){
            q2.offer(s.pop());
        }
        return q2.poll();
    }

    public static void main(String[] args) {
        Queue_reverse queue=new Queue_reverse();
        queue.Enqueue(12);
        queue.Enqueue(5);
        queue.Enqueue(15);
        queue.Enqueue(20);
        System.out.println(queue.Dequeue());
        System.out.println(queue.Dequeue());
        System.out.println(queue.Dequeue());
        System.out.println(queue.Dequeue());

    }
}
