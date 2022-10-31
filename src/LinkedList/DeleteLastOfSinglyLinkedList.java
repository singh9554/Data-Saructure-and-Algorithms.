package LinkedList;

public class DeleteLastOfSinglyLinkedList {
    public static void main(String[]args){
        NodeDL n1 = new NodeDL(10);
        NodeDL n2 = new NodeDL(20);
        NodeDL n3 = new NodeDL(30);
        NodeDL n4 = new NodeDL(40);
        NodeDL head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        System.out.println("Before Deleting the last Node");
        NodeDL curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
        DeleteLast(head);
    }
    static void DeleteLast(NodeDL head){
        if(head == null || head.next == null){
            return;
        }
        NodeDL prev = head;
       while(prev.next.next!=null){
            prev = prev.next;
        }
        prev.next = prev.next.next;
        System.out.println("After Deleting the last Node");
        NodeDL curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
class NodeDL{
    int data;
    NodeDL next;
    public NodeDL(int data){
        this.data = data;
    }
}