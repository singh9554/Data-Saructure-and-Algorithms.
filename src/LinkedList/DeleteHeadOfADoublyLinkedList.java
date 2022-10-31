package LinkedList;

public class DeleteHeadOfADoublyLinkedList {
    public static void main(String[]args){
        NodeDD n1 = new NodeDD(10);
        NodeDD n2 = new NodeDD(20);
        NodeDD n3 = new NodeDD(30);
        NodeDD head = n1;
        head.prev = null;
        head.next = n2;
        n2.prev = head;
        n2.next = n3;
        n3.prev = n2;
        n3.next = null;
        System.out.println(DeleteHead(head));
    }
    static int DeleteHead(NodeDD head){
      if(head == null || head.next == null){
          System.out.println("null");
      }
      head = head.next;
      head.prev = null;
      return head.data;
    }
}
class NodeDD{
    int data;
    NodeDD next;
    NodeDD prev;
    public NodeDD(int data){
        this.data = data;
    }
}
