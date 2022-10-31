package LinkedList;

public class Implementation {
    public static void main(String[]args){
  Node n1 = new Node(10);
  Node n2 = new Node(20);
  Node n3 = new Node(30);
  Node n4 = new Node(40);
  Node n5 = new Node(50);
  Node head = n1;
  n1.next = n2;
  n2.next = n3;
  n3.next=n4;
  n4.next=n5;
  n5.next=null;
  Node curr = head;
  while(curr != null){
      System.out.print(curr.data+"-");
      curr = curr.next;
  }
    }
}
class Node{
    int data;
    Node next;
    public Node(int x){
        this.data = x;
        next = null;
    }
}
