package LinkedList;

public class InsertAtBeginOfSinglyLinkedList {
    public static void main(String[]args){
       NodeI head = null;
       head = Insert(head,30);
       head = Insert(head,20);
       head = Insert(head,10);
    }
    static  NodeI Insert(NodeI head,int x){
        NodeI temp = new NodeI(x);
        temp.next= head;
        return temp;
    }
}
class NodeI{
    int data;
    NodeI next;
    public NodeI(int data){
        this.data = data;
    }
}
