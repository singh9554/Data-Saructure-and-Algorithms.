package LinkedList;
import java.util.*;
public class ReverseALinkedList {
    public static void main(String[]args){
        NodeRev n1 = new NodeRev(10);
        NodeRev n2 = new NodeRev(20);
        NodeRev n3 = new NodeRev(30);
        NodeRev n4 = new NodeRev(40);
        NodeRev head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
//        System.out.println(ReverseM1(head));
        System.out.println(ReverseM2(head));
    }
    //Naive Approach Time Complexity O(N) space complexity is O(N);
    static int ReverseM1(NodeRev head){
        ArrayList<Integer> arr = new ArrayList<>();
        for(NodeRev curr = head ; curr != null ; curr = curr.next){
            arr.add(curr.data);
        }
        for(NodeRev curr = head; curr != null; curr = curr.next){
            curr.data = arr.remove(arr.size() - 1);
        }
return head.data;
    }
    //Efficient Approach Time Complexity O(N) space complexity is O(1);
    static int ReverseM2(NodeRev head){
        if(head.next == null){
            return head.data;
        }
        if(head == null){
            return -1;
        }
        NodeRev curr = head;
        NodeRev prev = null;
        while(curr != null){
            NodeRev next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev.data;
    }
}
class NodeRev{
    int data;
    NodeRev next;
    public NodeRev(int data){
        this.data =data;
    }
}