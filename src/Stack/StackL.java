package Stack;
import java.util.*;
public class StackL {
public static void print(Stack<Integer>stack){
    for(int i=0;i<stack.size();i++){
        System.out.println(stack.elementAt(i));
    }
    System.out.println("");
}
public static void main(String[]args){
    Stack<Integer> stack=new Stack<Integer>();
    Scanner scan=new Scanner(System.in);
    int data;
    for(int i=1;i<=5;i++){
        System.out.println("Enter data: ");
        data=scan.nextInt();
        stack.push(data);
    }
    print(stack);
    System.out.println("Peek: "+stack.peek());
    System.out.println("Pop: "+stack.pop());
    System.out.println("peek:"+stack.peek());
    print(stack);
}
}
