package Stack;
import java.util.*;
public class Smallest_element {
public static void Smallest(int []arr){
    Deque<Integer> stack=new ArrayDeque<Integer>();
    for(int i=0;i<arr.length;i++){
        while(!stack.isEmpty() && stack.peek()>=arr[i]){
            stack.pop();
        }
        if(stack.isEmpty()){
            System.out.println("-1");
        }
        else{
            System.out.println(stack.peek());
        }
        stack.push(arr[i]);
    }
}
public static void main(String[]args){
    int arr[]={4,10,5,8,20,15,3,12};
    System.out.println("The smallest element of the array are: ");
    Smallest(arr);
}
}
