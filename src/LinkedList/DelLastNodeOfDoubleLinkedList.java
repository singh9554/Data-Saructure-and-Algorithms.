package LinkedList;

public class DelLastNodeOfDoubleLinkedList {
    public static void main(String[]args){
        NodeDLD n1 = new NodeDLD(10);
        NodeDLD n2 = new NodeDLD(20);
        NodeDLD n3 = new NodeDLD(30);
        NodeDLD head = n1;
        head.prev = null;
        head.next = n2;
        n2.prev = head;
        n2.next = n3;
        n3.prev = n2;
        n3.next = null;
   DeleteLastNode(head);
    }
    static void DeleteLastNode(NodeDLD head){
        if(head == null || head.next == null){
            System.out.println("null");
        }
        NodeDLD curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.prev.next = null;
        NodeDLD che = head;
        System.out.print("null-");
        while(che != null){
            System.out.print(che.data+"-");
            che = che.next;
        }
        System.out.print("null");

    }
}
class NodeDLD{
    int data;
    NodeDLD next;
    NodeDLD prev;
    public NodeDLD(int data){
        this.data = data;
    }
}
