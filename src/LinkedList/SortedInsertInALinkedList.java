package LinkedList;
public class SortedInsertInALinkedList{
    public static void main(String[]args){
        NodeISort n1 = new NodeISort(10);
        NodeISort n2 = new NodeISort(20);
        NodeISort n3 = new NodeISort(30);
        NodeISort n4 = new NodeISort(40);
        NodeISort head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        InsertSorted(head,25);
    }
    static void InsertSorted(NodeISort head, int x){
        NodeISort add = new NodeISort(x);
        if(head == null){
            head.data = add.data;
        }
        if(x<head.data){
            add.next = head;
        }
        NodeISort curr = head;
        while(curr.next != null && curr.next.data<x){
            curr = curr.next;
        }
        add.next = curr.next;
        curr.next = add;
        NodeISort sort = head;
        while(sort != null){
            System.out.print(sort.data+" ");
            sort = sort.next;
        }
    }
}
class NodeISort{
    int data;
    NodeISort next;
    public NodeISort(int data){
        this.data = data;
    }
}
