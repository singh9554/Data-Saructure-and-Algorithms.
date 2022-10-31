package LinkedList;

public class InsertAtTheEndOfCircularLinkedList {
    public static void main(String[]args){
        NodeIECir n1 = new NodeIECir(10);
        NodeIECir n2 = new NodeIECir(20);
        NodeIECir n3 = new NodeIECir(30);
        NodeIECir  head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = head;
        System.out.println(insertEndOfCircularLinkedList(head,15));
    }
    static int insertEndOfCircularLinkedList(NodeIECir head,int x){
        NodeIECir add = new NodeIECir(x);
        if (head == null) {
            add.next = add;
            return add.data;
        }
        else{
            add.next = head.next;
            head.next = add;
            int t = add.data;
            add.data = head.data;
            head.data = t;
        }
        return add.data;
    }
}
class NodeIECir{
    int data;
    NodeIECir next;
    public NodeIECir(int data){
        this.data = data;
    }
}
