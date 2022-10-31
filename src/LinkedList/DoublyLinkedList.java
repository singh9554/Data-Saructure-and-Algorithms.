package LinkedList;
import java.util.*;
public class DoublyLinkedList {
    public static void main(String[]args){
        NodeDouble n1 = new NodeDouble(10);
        NodeDouble n2 = new NodeDouble(20);
        NodeDouble n3 = new NodeDouble(30);
        NodeDouble n4 = new NodeDouble(40);
        NodeDouble head = n1;
        head.prev = null;
        head.next = n2;
        n2.prev = head;
        n2.next = n3;
        n3.prev = n2;
        n3.next = n4;
        n4.prev = n3;
        n4.next = null;
//        DoubleLinkedList(head,n4);
        System.out.println(insertDoublyLinkedList(head,5));
    }
    //Traverse In A Double Linked List;
//    static void DoubleLinkedList(NodeDouble head,NodeDouble n4){
//        NodeDouble curr = head;
//        NodeDouble curr2= n4;
//        while(curr != null && curr2 != null){
//            System.out.print(curr.data+"-");
//            System.out.print(curr2.data+"-");
//            curr = curr.next;
//            curr2 = curr2.prev;
//
//        }
//    }
    static int insertDoublyLinkedList(NodeDouble head,int data){
        NodeDouble node = new NodeDouble(data);
        node.next = head;
        if(head != null){
            head.prev = node;
        }
        return node.data;
    }
}
class NodeDouble{
    int data;
    NodeDouble next;
    NodeDouble prev;
    public NodeDouble(int data){
        this.data = data;
    }
}