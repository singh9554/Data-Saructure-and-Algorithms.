package LinkedList;
import Queues.Queues.search;

import java.util.*;
public class SearchInALinkedList {
    public static void main(String []args){
        NodeS n1 = new NodeS(10);
        NodeS n2 = new NodeS(15);
        NodeS n3 = new NodeS(20);
        NodeS n4 = new NodeS(40);
        NodeS head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        System.out.println(Search(head,20));
        System.out.println(SearchR(head,20));
    }
    //Iterative Function;
    static int Search(NodeS head,int target){
        NodeS curr = head;
        int pos = 1;
        while(curr != null) {
            if (curr.data == target) {
                return pos;
            } else {
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }
    //Recursive Function;
    static int SearchR(NodeS head, int target){
       if(head == null){
           return -1;
       }
       else if(head.data == target){
           return 1;
       }
       else{
           int res = SearchR(head.next,target);
           if(res == -1){
               return -1;
           }
           else{
               return (res + 1);
           }
       }
    }
}
class NodeS{
    int data;
    NodeS next;
    public NodeS(int data){
        this.data =data;
    }
}
