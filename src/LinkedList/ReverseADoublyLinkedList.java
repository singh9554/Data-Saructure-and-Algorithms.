package LinkedList;

public class ReverseADoublyLinkedList{
    public static void main(String[] args) {
        NodeDoubleReverse n1 = new NodeDoubleReverse(10);
        NodeDoubleReverse n2 = new NodeDoubleReverse(20);
        NodeDoubleReverse n3 = new NodeDoubleReverse(30);
        NodeDoubleReverse n4 = new NodeDoubleReverse(40);
        NodeDoubleReverse head = n1;
        head.prev = null;
        head.next = n2;
        n2.prev = head;
        n2.next = n3;
        n3.prev = n2;
        n3.next = n4;
        n4.prev = n3;
        n4.next = null;
        System.out.println(ReverseDoubleList(head));
    }
    static int ReverseDoubleList(NodeDoubleReverse head){
        if(head == null || head.next == null){
            return head.data;
        }
        NodeDoubleReverse previ = null;
        NodeDoubleReverse curr = head;
        while(curr!=null){
            previ = curr.prev;
            curr.prev = curr.next;
            curr.next = previ;
            curr = curr.prev;
        }
        while(previ != null){
            System.out.print(previ.data+" ");
            previ = previ.prev;
        }
        return previ.prev.data;
    }
}
class NodeDoubleReverse{
    int data;
    NodeDoubleReverse next;
    NodeDoubleReverse prev;
    public NodeDoubleReverse(int data){
        this.data = data;
    }
}
