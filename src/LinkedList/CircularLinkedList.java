package LinkedList;
public class CircularLinkedList {
    public static void main(String[] args) {
        NodeCir n1 = new NodeCir(10);
        NodeCir n2 = new NodeCir(20);
        NodeCir n3 = new NodeCir(30);
        NodeCir head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = head;
        circularList(head);
    }
    static void circularList(NodeCir head){
        if(head == null) return ;
        System.out.print(head.data+" ");
        NodeCir curr = head.next;
        while(curr != head){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
class NodeCir{
    int data;
    NodeCir next;
    public NodeCir(int data){
        this.data = data;
    }
}
