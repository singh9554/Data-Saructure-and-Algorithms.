//Stack implementation using Queue.
package Stack;
import java.util.Queue;
import java.util.ArrayDeque;
public class StackQ {
Queue<Integer> q1= new ArrayDeque<Integer>();
Queue<Integer> q2= new ArrayDeque<Integer>();
 void enqueue(int data){
     while(!q1.isEmpty()){
         q2.offer(q1.poll());
     } q1.offer(data);
     while(!q2.isEmpty()){
         q1.offer(q2.poll());
     }
 }
 int Dequeue(){
     return q1.poll();
 }
 public static void main(String[]args){
     StackQ stack=new StackQ();
     stack.enqueue(100);
     stack.enqueue(200);
     stack.enqueue(300);
     stack.enqueue(400);
     stack.enqueue(500);
     System.out.println(stack.Dequeue());
     System.out.println(stack.Dequeue());
     System.out.println(stack.Dequeue());
     System.out.println(stack.Dequeue());
     System.out.println(stack.Dequeue());
 }
}
