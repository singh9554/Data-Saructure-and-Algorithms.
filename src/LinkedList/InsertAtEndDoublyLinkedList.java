package LinkedList;
public class InsertAtEndDoublyLinkedList {
    public static void main(String[]args){
  NodeDDE n1 = new NodeDDE(10);
  NodeDDE n2 = new NodeDDE(20);
  NodeDDE n3 = new NodeDDE(30);
  NodeDDE n4 = new NodeDDE(40);
  NodeDDE head = n1;
  head.prev = null;
  head.next = n2;
  n2.prev = head;
  n2.next = n3;
  n3.prev = n2;
  n3.next = n4;
  n4.prev = n3;
  n4.next = null;
  insertEnd(head,60);
    }
   static void insertEnd(NodeDDE head,int data){
        NodeDDE end = new NodeDDE(data);
        while(head == null){
            head = end;
        }
        NodeDDE curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = end;
        end.prev = curr;
        end.next = null;
        NodeDDE m = head;
        while(m != null){
            System.out.print(m.data+" ");
            m = m.next;
        }
   }
}
class NodeDDE{
    int data;
    NodeDDE next;
    NodeDDE prev;
    public NodeDDE(int data){
        this.data = data;
    }
}
