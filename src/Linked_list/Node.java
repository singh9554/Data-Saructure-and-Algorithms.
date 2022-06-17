package Linked_list;
public class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
    public static void main(String[] args) {
        Node n1 = new Node(50);
        Node n2 = new Node(30);
        Node n3=new Node(40);
        Node n4=new Node(60);
        Node head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
    }
}








