//<<<<<<<<<<<--------------------------FLATTEN A MULTILEVEL LINKED LIST-------------------------------------->>>>>>>>>>>
package Queues.Queues;
class NODE_M {
    int data;
    NODE_M next, down;
    public NODE_M(int data) {
     this.data=data;
    }
}
public class Multilevel {
    public static void flatten(NODE_M head){
        NODE_M curr=head;
        NODE_M last=head;
        while(last!=null) {
            last = last.next;
            if (curr.down != null) {
                last = curr.down;
                System.out.println(curr.data);
                curr = curr.next;
            }

        }
    }
    public static void main(String[]args){
        //Initializing a Linked List.....
        Multilevel obj=new Multilevel();
     NODE_M n1=new NODE_M(1);
     NODE_M n2=new NODE_M(2);
     NODE_M n3=new NODE_M(3);
     NODE_M n4=new NODE_M(4);
     NODE_M n5=new NODE_M(5);
     NODE_M n6=new NODE_M(6);
     NODE_M n7=new NODE_M(7);
     NODE_M n8=new NODE_M(8);
     NODE_M n9=new NODE_M(9);
     NODE_M n10=new NODE_M(10);
     NODE_M n11=new NODE_M(11);
     NODE_M n12=new NODE_M(12);
     NODE_M n13=new NODE_M(13);
     NODE_M n14=new NODE_M(14);
     NODE_M n15=new NODE_M(15);
     NODE_M n16=new NODE_M(16);
     NODE_M n17=new NODE_M(17);
     //Initializing the next node.
          NODE_M head=n1;
          head.next=n2;
          n2.next=n3;
          n3.next=n4;
          n4.next=n5;
          n5.next=null;
          n6.next=n7;
          n7.next=n8;
          n8.next=null;
          n9.next=n10;
          n13.next=n14;
          n14.next=null;
          n16.next=n17;
          n17.next=null;
          // Initializing the down value;
        head.down=n6;
        n4.down=n9;
        n7.down=n11;
        n8.down=n12;
        n9.down=n13;
        n12.down=n15;
        n13.down=n16;
        flatten(head);

    }
}
