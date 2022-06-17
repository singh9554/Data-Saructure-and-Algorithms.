package Queues.Queues;
import java.util.Queue;
import java.util.ArrayDeque;
public class search {
    Queue<Integer>q=new ArrayDeque<>();
//    public search(int n){
//
//    }
    void enqueue(int data){
        q.offer(data);
    }
    int dequeue(){
        return q.poll();
    }
    int front(){
        return q.peek();
    }
    String find(int x){

        while(!q.isEmpty()&&q.peek()!=x){
            q.poll();
        }
        if (q.isEmpty()) {
            return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
search queue=new search();
queue.enqueue(1);
queue.enqueue(3);
     System.out.println("poll: "+queue.dequeue());
        System.out.println("peek: "+queue.front());
queue.enqueue(4);
queue.enqueue(5);
queue.enqueue(6);
int x=6;
        System.out.println("find: "+queue.find(x));

    }
}
