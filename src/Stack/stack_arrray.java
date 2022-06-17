package Stack;

public class stack_arrray {
    int arr[];
    int top;
    int capacity;
    public stack_arrray(int capacity){
        this.capacity=capacity;
        top=-1;
        arr=new int[capacity];
    }
    void push(int data){
        if(top==capacity-1) {
            System.out.println("stack overflow: ");
        }
             top++;
            arr[top]=data;
            System.out.println("The data pushed in the stack: "+"("+data+")");
        }
     int pop(){
        if(top==-1){
            System.out.println("Is underflow condition:");
        }
        int res=arr[top];
        top--;
        return res;
     }
     int peek(){
        if(top==-1){
            System.out.println("The stack is empty: ");
        }
        return arr[top];
     }
     boolean isEmpty(){
        return top==-1;
     }
     public static void main(String[]args){
         stack_arrray stack=new stack_arrray(5);
         stack.push(10);
         stack.push(20);
         stack.push(30);
         stack.push(40);
         stack.push(50);
         System.out.println("The element that got pop from the stack is:"+"("+stack.pop()+")");
         System.out.println("The element that got peek from the stack is:"+"("+stack.peek()+")");
         System.out.println("Is the Stack Empty:"+"("+stack.isEmpty()+")");

     }
    }

