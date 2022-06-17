package Linked_list;

public class NodeR {
    int data;
   NodeR next;

    NodeR(int data){
        this.data=data;
    }
//    //Itretive function;
    public static NodeR Reverse(NodeR head){
        NodeR curr=head;
        NodeR prev=null;
          while(curr!=null){
            NodeR temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;

   }
    //    Recursive Function.

//    public static NodeR reverse(NodeR head){
//        if(head==null || head.next==null){
//            return  head;
//        }
//        NodeR newhead=reverse(head.next);
//         NodeR headNext=head.next;
//        headNext.next=head;
//        head.next=null;
//        return newhead;
//    }


    public static void main(String[] args) {
        NodeR n1=new NodeR(10);
        NodeR n2=new NodeR(20);
        NodeR n3=new NodeR(30);
        NodeR n4=new NodeR(40);
        NodeR n5=new NodeR(50);
        NodeR n6=new NodeR(60);
        NodeR head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=null;
        System.out.println("Print the Original Linked List: ");
        NodeR curr=head;
        while(curr!=null){
            System.out.print(curr.data+"-");
            curr=curr.next;
        } System.out.println("\nPrint the Reverse Linked List Head Node: ");
        //Iterative funtion.
       NodeR result= Reverse(head);
        System.out.println("\n"+result.data);

        //Recursive function.
//       NodeR result= reverse(head);
//        System.out.println(result.data);

    }
}
