package LinkedList;

public class InsertAtTheGivenPosition{
    public static void main(String[] args) {
        NodeIP n1 = new NodeIP(10);
        NodeIP n2 = new NodeIP(20);
        NodeIP n3 = new NodeIP(30);
        NodeIP n4 = new NodeIP(40);
        NodeIP n5 = new NodeIP(50);
        NodeIP head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;
        NodeIP curr = head;
        System.out.println("Before Modifying the Linked List");
        while(curr != null){
            System.out.print(curr.data+"-");
            curr = curr.next;
        }
        System.out.println();
        System.out.println(InsertGPos(head,3,25));
    }
    static int InsertGPos(NodeIP head,int pos,int data){
        NodeIP add = new NodeIP(data);
        if(pos == 1){
            add.next = head;
            head = add;
            return head.data;
        }
        NodeIP prev = head;
        for(int i = 1;i<pos-1;i++){
            prev = prev.next;
        }
        add.next = prev.next;
        prev.next = add;
        NodeIP curr = head;
        System.out.println("After Modifying the LinkedList");
        while(curr != null){
            System.out.print(curr.data+"-");
            curr = curr.next;
        }
        System.out.println();
        System.out.println("Head of the Modifying Linked List");
        return head.data;
    }
}
class NodeIP{
    int data;
    NodeIP next;
    public NodeIP(int data){
        this.data = data;
    }
}
