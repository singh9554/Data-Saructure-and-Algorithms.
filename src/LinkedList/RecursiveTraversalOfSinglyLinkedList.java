package LinkedList;

public class RecursiveTraversalOfSinglyLinkedList {
    public static void main(String[] args) {
        NodeR n1 = new NodeR(10);
        NodeR n2 = new NodeR(20);
        NodeR n3 = new NodeR(30);
        NodeR n4 = new NodeR(40);
        NodeR n5 = new NodeR(50);
        NodeR head = n1;
        n1.next = n2;
        n2.next=n3;
        n3.next = n4;
        n4.next = n5;
        n5.next =null;
        rLink(head);
    }
    static void rLink(NodeR head){
        if(head==null){
            return;
        }
        System.out.println(head.data+"-");
        rLink(head.next);
    }
}
 class NodeR{
 int data;
 NodeR next;
 public NodeR(int data){
     this.data=data;
     next=null;
 }
}
