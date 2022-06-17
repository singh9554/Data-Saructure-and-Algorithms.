package Queues;
import java.util.Queue;
import java.util.ArrayDeque;
public class Generate_number {
static void generate(int n){
    Queue<String> q=new ArrayDeque<String>();
     q.offer("5");
     q.offer("6");
     for(int count=0;count<n;count++){
         String x=q.poll();
         System.out.println(x);
         q.offer(x+"5");
         q.offer(x+"6");
     }
}

    public static void main(String[] args) {
        Generate_number obj=new Generate_number();
        int n=10;
        generate(n);
    }
}
