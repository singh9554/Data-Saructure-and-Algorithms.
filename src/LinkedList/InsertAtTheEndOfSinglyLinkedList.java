package LinkedList;
public class InsertAtTheEndOfSinglyLinkedList {
    public static void main(String[]args){
       NodeIE  n1 = new NodeIE(10);
       NodeIE n2 = new NodeIE(20);
       NodeIE n3 = new NodeIE(30);
       NodeIE head = n1;
       head.next = n2;
       n2.next = n3;
       n3.next = null;
        NodeIE curr = head;
        System.out.println("Before Adding");
        while(curr != null){
            System.out.print(curr.data+"-");
            curr = curr.next;
        }
        System.out.println();
        System.out.println("After Adding");
        InsertEnd(head,40);
    }
    static void InsertEnd(NodeIE head, int x){
        NodeIE temp = new NodeIE(x);
        if(head == null){
            head = temp;
            head.next = null;
        }
        NodeIE curr = head;
        NodeIE prev = curr;
        while(curr != null){
            prev = curr;
            curr = curr.next;

        }
        prev.next = temp;
     prev.next.next = curr;
        NodeIE curr2 = head;
        while(curr2 != null){
            System.out.print(curr2.data+"-");
            curr2 = curr2.next;
        }
    }
}
class NodeIE{
    int data;
    NodeIE next;
    public NodeIE(int data){
        this.data = data;
    }
}
