package LinkedList;
import java.util.*;
public class DetectLoop {
    public static void main(String[] args){
         NodeDLoop n1 = new NodeDLoop(10);
         NodeDLoop n2 = new NodeDLoop(20);
         NodeDLoop n3 = new NodeDLoop(30);
         NodeDLoop n4 = new NodeDLoop(40);
         NodeDLoop n5= new NodeDLoop(50);
         NodeDLoop head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n3;
//        System.out.println(detectLoopM1(head));
        System.out.println(detectLoopM2(head));
    }
    //Method 1  Using HashSet : TimeComplexity is O(N) and space complexity O(N);
    static boolean detectLoopM1(NodeDLoop head){
        HashSet<NodeDLoop> hs = new HashSet<NodeDLoop>();
        hs.add(head);
        NodeDLoop curr = head;
        while(curr != null ){
            if(hs.contains(curr.next)){
                return true;
            }
            else{
                hs.add(curr.next);
            }
            curr = curr.next;
        }
        return false;
    }
    //Method 2 Using (Floyd's Cycle Detection Algorithm) Time complexity O(N) and space complexity (1);
    static boolean detectLoopM2(NodeDLoop head){
        NodeDLoop slow = head;
        NodeDLoop fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow != fast){
                return true;
            }
        }
        return false;
    }
}
class NodeDLoop{
    int data;
    NodeDLoop next;
    public NodeDLoop(int data){
        this.data = data;
    }
}
