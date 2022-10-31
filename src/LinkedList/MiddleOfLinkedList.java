package LinkedList;
public class MiddleOfLinkedList {
    public static void main(String[]args){
        NodeMLL n1 = new NodeMLL(10);
        NodeMLL n2 = new NodeMLL(20);
        NodeMLL n3 = new NodeMLL(30);
        NodeMLL n4 = new NodeMLL(40);
        NodeMLL head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        System.out.println(findMiddle(head));
    }
    static int findMiddle(NodeMLL head){
        if(head == null){
            return -1;
        }
        if(head.next == null){
            return head.data;
        }
        NodeMLL slow = head,fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
class NodeMLL{
    int data;
    NodeMLL next;
    public NodeMLL(int data){
        this.data = data;
    }
}
