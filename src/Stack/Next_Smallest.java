package Stack;
import java.util.*;
public class Next_Smallest {
    public static void Next_Smallest(int [] arr){
        Deque<Integer> stack= new ArrayDeque<Integer>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr[i]<=stack.peek()){
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
    public static void main(String[] args){
        int []arr={3,10,5,1,15,10,7,6};
        Next_Smallest(arr);



    }
}
