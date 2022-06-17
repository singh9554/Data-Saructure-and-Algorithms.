package Queues;

public class Queue_A {
    int arr[];
    int capacity;
    int rear;
    public Queue_A(int n){
        capacity=n;
        arr=new int[n];
        rear=-1;
    }
    void enqueue(int data){
     if(rear==capacity-1){
         System.out.println("Queue overflow");
     }
     rear++;
     arr[rear]=data;
    }
    int dequeue(){
        if(rear==-1){
            System.out.println("Queue underflow");
        }
        int result=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return result;
    }
    int getfront(){
        if(rear==-1){
            System.out.println("Queue is empty");
        }
        return arr[0];
    }
    public static void main(String []args){
        Queue_A queue=new Queue_A(5);
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println(queue.dequeue());
        queue.enqueue(30);
        System.out.println(queue.dequeue());
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue.dequeue());
        System.out.println(queue. getfront());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
}
