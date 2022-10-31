package LinkedList;

public class RemoveDuplicateFromASortedLinkedList {
    public static void main(String[] args) {
        NodeReDp n1 = new NodeReDp(10);
        NodeReDp n2 = new NodeReDp(20);
        NodeReDp n3 = new NodeReDp(20);
        NodeReDp n4 = new NodeReDp(40);
        NodeReDp n5 = new NodeReDp(40);
        NodeReDp n6 = new NodeReDp(40);
        NodeReDp head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;
        RemoveDuplicate(head);
        displayPrint(head);
    }
    static void RemoveDuplicate(NodeReDp head){
        NodeReDp curr = head;
        while(curr != null && curr.next != null){
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
    }
    static void displayPrint(NodeReDp head){
        NodeReDp curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}
class NodeReDp{
    int data;
    NodeReDp next;
    public NodeReDp(int data){
        this.data = data;
    }
}
