package LinkedList;
public class DeleteHeadOfCircularLinkedList {
    public static void main(String[]args){
        NodeDHCir n1 = new NodeDHCir(10);
        NodeDHCir n2 = new NodeDHCir(20);
        NodeDHCir n3 = new NodeDHCir(30);
        NodeDHCir head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = head;
        System.out.println(DeleteHead(head));
    }
    static int DeleteHead(NodeDHCir head){
        if(head == null) return -1;
        if(head.next == head) return -1;
        head.data = head.next.data;
        head.next = head.next.next;
        return head.data;
    }
}
class NodeDHCir{
    int data;
    NodeDHCir next;
    public NodeDHCir(int data){
        this.data = data;
    }
}
