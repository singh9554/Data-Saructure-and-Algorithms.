package Linked_list;

public class NodeP {
    char data;
    NodeP next;
    NodeP(char data){
        this.data=data;
    }
    public static NodeP reverse(NodeP head){
        if(head==null || head.next==null){
            return head;
        }
        NodeP newhead=reverse(head.next);
        NodeP headnext=head.next;
        headnext.next=head;
        head.next=null;
        return newhead;
    }
    public static NodeP middle(NodeP head){
        NodeP fast=head;
        NodeP slow=head;
        if(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static boolean Palindrome(NodeP head){
        if(head==null){
            return true;
        }
        NodeP mid=middle(head);
        NodeP last=reverse(mid.next);
        NodeP curr=head;
        while(last!=null ){
            if(last.data!=curr.data){
                return false;
            }
            curr=curr.next;
            last=last.next;
        }return true;
    }
    public static void main(String[]args){
        NodeP n1=new NodeP('A');
        NodeP n2=new NodeP('B');
        NodeP n3=new NodeP('C');
        NodeP n4=new NodeP('B');
        NodeP n5=new NodeP('A');
        NodeP head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;
        reverse(head);
        middle(head);
        System.out.println(Palindrome(head)+"\nYes it is a Palindrome");
    }
}
