package Linked_list;

public class Nodein {
    int data;
    Nodein next;

    public Nodein(int data) {
        this.data = data;
    }

    public static void insert(int data, Nodein head, int pos) {
        Nodein toAdd = new Nodein(data);
        if (head == null || head.next == null) {
            return;
        }
        Nodein prev = head;
        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }
        toAdd.next = prev.next;
        prev.next = toAdd;
        System.out.println("\nThe updated linkedlist is: ");
        Nodein curr = head;
   while (curr != null) {
            System.out.print(curr.data + "-");
            curr = curr.next;
        }

    }
    public static void main(String[]args){
        Nodein n1=new Nodein(10);
        Nodein n2=new Nodein(20);
        Nodein n3=new Nodein(30);
        Nodein n4=new Nodein(40);
        Nodein n5=new Nodein(50);
        Nodein head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;
        Nodein curr=head;
        while(curr!=null){
            System.out.print(curr.data+"-");
            curr=curr.next;
        }
     insert(90,head,3);

    }
}
