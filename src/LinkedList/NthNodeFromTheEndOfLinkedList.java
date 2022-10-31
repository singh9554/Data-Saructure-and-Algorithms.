package LinkedList;
public class NthNodeFromTheEndOfLinkedList {
    public static void main(String[]args){
        NodeEnd n1 = new NodeEnd(10);
        NodeEnd n2 = new NodeEnd(20);
        NodeEnd n3 = new NodeEnd(30);
        NodeEnd n4 = new NodeEnd(40);
        NodeEnd head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        findNthNodeM1(head,3);
        findNthNode(head,3);
    }
    //Method 3;
    static void findNthNodeM1(NodeEnd head,int n){
        int len = 0;
        if(head == null) return;
        for(NodeEnd curr = head; curr != null; curr = curr.next){
            len++;
        }
        NodeEnd curr= head;
        for(int i = 1 ; i < (len-n+1);i++){
            curr = curr.next;
        }
        System.out.println(curr.data);
    }
    //Method 2;
    static void findNthNode(NodeEnd head,int n){
   if (head == null) return;
        NodeEnd fast=head;
   for(int i = 1; i <= n;i++){
       if(fast == null){
           return;
       }
       fast = fast.next;
   }
        NodeEnd second = head;
   while(fast != null){
       second = second.next;
       fast = fast.next;
   }
        System.out.println(second.data);
    }
}
class NodeEnd{
    int data;
    NodeEnd next;
    public NodeEnd(int data){
        this.data = data;
    }
}