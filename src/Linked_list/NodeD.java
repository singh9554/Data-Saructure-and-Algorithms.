package Linked_list;

public class NodeD {
int data;
NodeD next;
NodeD(int data){
    this.data=data;
}
public static NodeD detect_cycle(NodeD head){
    NodeD fast=head;
    NodeD slow=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            return slow;
        }
    }return null;
}
public static void main(String[]args){
    NodeD n1=new NodeD(10);
    NodeD n2=new NodeD(20);
    NodeD n3=new NodeD(30);
    NodeD n4=new NodeD(40);
    NodeD n5=new NodeD(50);
    NodeD n6=new NodeD(60);
    NodeD head=n1;
    head.next=n2;
    n2.next=n3;
    n3.next=n4;
    n4.next=n5;
    n5.next=n6;
    n6.next=n3;
    System.out.println("The point where both the pointers meet: ");
    System.out.println(detect_cycle(head).data);
}
}
