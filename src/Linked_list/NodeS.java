package Linked_list;

public class NodeS {
    int data;
    NodeS next;
    NodeS(int data){
        this.data=data;
    }
    public static NodeS detect_cycle2(NodeS head){
        NodeS fast=head;
        NodeS slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return slow;
            }
        }return null;
    }
    public static NodeS Detect_the_starting_point(NodeS head){
        NodeS meet=detect_cycle2(head);
        NodeS start=head;
        while(start!=meet){
            meet=meet.next;
            start=start.next;
        }
        return start;
    }
    public static void main(String[]args){
        NodeS n1=new NodeS(10);
        NodeS n2=new NodeS(20);
        NodeS n3=new NodeS(30);
        NodeS n4=new NodeS(40);
        NodeS n5=new NodeS(50);
        NodeS n6=new NodeS(60);
        NodeS head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n3;
        System.out.println("The starting point of the cycle is:");
        System.out.println(Detect_the_starting_point(head).data);
    }
}
