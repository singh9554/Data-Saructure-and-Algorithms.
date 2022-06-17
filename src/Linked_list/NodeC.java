package Linked_list;

public class NodeC {
    int data;
    NodeC next;
    NodeC random;
    NodeC(int data) {
        this.data = data;
    }
    public static NodeC duplicate(NodeC head){
        NodeC curr=head;
        //Inserting new node in between.
        while(curr!=null){
            NodeC temp=curr.next;
            curr.next= new NodeC(curr.data);
            curr.next.next=temp;
            curr=temp;
        }
        //Setting Random Pointers of new Nodes.
        curr=head;
        while(curr!=null){
            if(curr.next!=null){
                curr.next.random=(curr.random!=null)?curr.random.next:null;
            }curr=curr.next.next;
        }
        //Seprating both the linked lists.
        NodeC orig=head, copy=head.next;
        NodeC temp=copy;
        while(orig!=null){
            orig.next=orig.next.next;
            copy.next=copy.next.next;
            orig=orig.next;
            copy=copy.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        NodeC n1 = new NodeC(50);
        NodeC n2 = new NodeC(30);
        NodeC n3 = new NodeC(40);
        NodeC n4 = new NodeC(60);
        NodeC head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        NodeC random=n1.next.next;
        n2.random=n1;
        n3.random=n2;
        n4.random=n3;
        System.out.println(duplicate(head).data);
    }
}
