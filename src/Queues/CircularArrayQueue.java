package Queues;

public class CircularArrayQueue {
int arr[];
int n;
int front=-1,rear=-1;
public CircularArrayQueue(int n){
    this.n=n;
    arr=new int[n];
}
void enqueue(int data){
    if((rear+1)%n==front){
        System.out.println("Queue overflow");
    }
    if(front==-1){
        front=0;
    }
    rear=(rear+1)%n;
    arr[rear]=data;
}
int dequeue(){
    if(front==-1){
        System.out.println("Queue Underflow");
    }
    int result=arr[front];
    if(front==rear){
        front=rear=-1;
    }
    else{
        front=(front+1)%n;
    }
    return result;
}
public static void main(String[]args){
    CircularArrayQueue queue=new CircularArrayQueue(5);
    queue.enqueue(10);
    queue.enqueue(20);
    System.out.println(queue.dequeue());
    queue.enqueue(30);
    queue.enqueue(40);
    System.out.println(queue.dequeue());
    queue.enqueue(50);
    System.out.println(queue.dequeue());
}
}
