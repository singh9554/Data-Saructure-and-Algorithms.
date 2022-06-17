package Linked_list;
import java.util.*;
public class ReverseALinkedList {
    public static void main(String[] args){
Reverse();
    }
    static void Reverse() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node head = n1;
        head.next = n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;
        Deque<Node> stack = new ArrayDeque<>();
     Node curr = head;
     while(curr != null) {
         stack.push(curr);
         curr = curr.next;
     }
     while(!stack.isEmpty()){
         head = stack.peek();
         head = head.next;
         stack.pop();
     }
     if(!stack.isEmpty()){
         head.next = stack.peek();
         stack.pop();
     }
     else{
         head.next= null;
     }
     curr = head;
        while (curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

    static class Node {
        int data;
        Node next;
        public Node (int data){
            this.data = data;
        }
    }

    }

