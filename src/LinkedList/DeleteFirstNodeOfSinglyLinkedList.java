package LinkedList;

public class DeleteFirstNodeOfSinglyLinkedList{
    public static void main(String[] args) {
        NodeD n1 = new NodeD(10);
        NodeD n2 = new NodeD(20);
        NodeD n3 = new NodeD(30);
        NodeD head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = null;
        DeleteFirst(head);
    }
    static NodeD DeleteFirst(NodeD head){
        if(head == null){
            return null;
        }
        System.out.println(head.next.data);
        return head.next;
    }
}
class NodeD{
    int data;
    NodeD next;
    public NodeD(int data){
        this.data = data;
    }
}