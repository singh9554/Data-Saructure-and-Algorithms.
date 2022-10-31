package LinkedList;

public class InsertHeadInCircularLinkedList{
    public static void main(String[]args){
        NodeIC n1 = new NodeIC(10);
        NodeIC n2 = new NodeIC(20);
        NodeIC n3 = new NodeIC(30);
        NodeIC head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = head;
        System.out.println(insertCircular(head,5));
    }
    static int insertCircular(NodeIC head,int x){
        NodeIC add = new NodeIC(x);
        if(head == null){
            add = add.next;
            return add.data;
        }
        else{
            add.next = head.next;
            head.next = add;
            int t = head.data;
            head.data = add.data;
            add.data = t;
        }
        return head.data;
    }
}
class NodeIC{
    int data;
    NodeIC next;
    public NodeIC(int data){
        this.data = data;
    }
}