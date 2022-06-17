//Implementation of Queue using stack.
package Queues;
import java.util.*;
public class Queue_S {
    Deque<Integer> s1=new ArrayDeque<>();
    Deque<Integer> s2=new ArrayDeque<>();
    void push(int data){
        s1.push(data);
    }
    int pop(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        int result=s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return result;
    }
    int peek(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        int result=s2.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return result;
    }
    public boolean empty() {
     return s2.isEmpty();
    }

    public static void main(String[] args) {
        Queue_S queue=new Queue_S();
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        queue.push(50);
        System.out.println(queue.pop());
        System.out.println("peek:"+queue.peek());
        System.out.println("isEmpty: "+queue.empty());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

    }
}
