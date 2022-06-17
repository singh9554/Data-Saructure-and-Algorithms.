package Stack;
import java.util.*;
public class mystack {
    int arr[];
    int capacity;
    int top;
    mystack(int capacity){
        this.capacity = capacity;
        top=-1;
        arr=new int[capacity];
    }
    public void push(int data){
        if(top==capacity-1){
            System.out.println("Exception overflow.");
        }
        top++;
        arr[top]=data;
        System.out.println("The data entered in the stack is: ("+data+")");
    }
    public int pop(){
        if(top==-1){
            System.out.println("Exception underflow");
        }
        int res=arr[top];
        top--;
        return res;
    }
    public int peeK(){
        if(top==-1){
            System.out.println("The stack is empty");
        }
        return arr[top];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public static void main(String[]args){
        mystack stack=new mystack(6);
       stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println("The value peeked from the stack is: ("+stack.peeK()+")");
        System.out.println("The value poped from the stack is: ("+ stack.pop()+")");
        System.out.println("The value peeked from the stack is: ("+stack.peeK()+")");

    }
}
