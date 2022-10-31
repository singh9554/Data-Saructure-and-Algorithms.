package LinkedList;

public class DeleteKthNodeFromCircularLinkedList {
    public static void main(String[]args){
        NodeDKth n1 = new NodeDKth(10);
        NodeDKth n2 = new NodeDKth(20);
        NodeDKth n3 = new NodeDKth(30);
        NodeDKth n4 = new NodeDKth(40);
        NodeDKth head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        int k = 2;
        DeleteKthNode(head,k);
    }
    static void DeleteKthNode(NodeDKth head,int k){
        if(head == null) return;
        if(head.next == null) {
            head = null;
            return;
        }
        NodeDKth curr = head;
        for(int i = 0 ; i < k - 2; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        NodeDKth now = head;
        while(now != null){
            System.out.print(now.data+" ");
            now = now.next;
        }
    }
}
class NodeDKth{
    int data;
    NodeDKth next;
    public NodeDKth(int data){
        this.data = data;
    }
}
