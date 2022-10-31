package LinkedList;
public class ReverseTheLinkedListRecursively {
    public static void main(String[]args){
        NodeReRecur n1 = new NodeReRecur(10);
        NodeReRecur n2 = new NodeReRecur(20);
        NodeReRecur n3 = new NodeReRecur(30);
        NodeReRecur n4 = new NodeReRecur(40);
        NodeReRecur head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
//        System.out.println(ReverseRecursiveM1(head));
        System.out.println(ReverseRecursiveM2(head,null));
    }
    //Method 1
    static NodeReRecur ReverseRecursiveM1(NodeReRecur head){
        if( head == null || head.next == null){
            return head;
        }
        NodeReRecur restHead = ReverseRecursiveM1(head.next);
        NodeReRecur restTail = head.next;
        restTail.next = head;
        head.next = null;
        return restHead;
    }
    //Method 2
    static NodeReRecur ReverseRecursiveM2(NodeReRecur curr, NodeReRecur prev){
        if(curr == null) return prev;
        NodeReRecur next = curr.next;
        curr.next = prev;
        return ReverseRecursiveM2(next,curr);
    }
}
class NodeReRecur{
    int data;
    NodeReRecur next;
    public NodeReRecur(int data){
        this.data = data;
    }
}

