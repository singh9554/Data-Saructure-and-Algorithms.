package Linked_list;

public class NodeDel {
    int data;
    NodeDel next;

    public NodeDel(int data) {
        this.data = data;
    }

    public static void Delete( NodeDel head, int pos) {
        if (head == null || head.next == null) {
            return;
        }
        NodeDel prev = head;
        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }
       prev.next=prev.next.next;
        System.out.println("\nThe Deleted linkedlist is: ");
        NodeDel curr = head;
        while (curr != null) {
            System.out.print(curr.data + "-");
            curr = curr.next;
        }

    }
    public static void main(String[]args){
        NodeDel n1=new NodeDel(10);
        NodeDel n2=new NodeDel(20);
        NodeDel n3=new NodeDel(30);
        NodeDel n4=new NodeDel(40);
        NodeDel n5=new NodeDel(50);
        NodeDel head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;
        NodeDel curr=head;
        while(curr!=null){
            System.out.print(curr.data+"-");
            curr=curr.next;
        }
        Delete(head,3);

    }
}
