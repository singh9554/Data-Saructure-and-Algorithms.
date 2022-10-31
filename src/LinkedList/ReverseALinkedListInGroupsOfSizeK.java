package LinkedList;
public class ReverseALinkedListInGroupsOfSizeK {
    public static void main(String[]args){
        NodeReK n1 = new NodeReK(10);
        NodeReK n2 = new NodeReK(20);
        NodeReK n3 = new NodeReK(30);
        NodeReK n4 = new NodeReK(40);
        NodeReK head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
//        System.out.println(ReverseGroupKM1(head,3));
        System.out.println(ReverseGroupKM2(head,3));
    }
    //Method 1 Recursive Method;
    static NodeReK ReverseGroupKM1(NodeReK head,int k ){
        NodeReK curr = head;
        NodeReK prev = null,next = null;
        int count = 0;
        while(curr != null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if(next != null){
            NodeReK restHead = ReverseGroupKM1(next,k);
            head.next = restHead;
        }
        return prev;
    }
    //Iterative solution Method 2;
    static NodeReK ReverseGroupKM2(NodeReK head,int k){
        NodeReK curr = head;NodeReK prevFirst = null;
        boolean isFirstPass=true;
        while(curr != null){
            NodeReK first = curr,prev = null;
            int count = 0;
            while(curr != null && count < k){
                NodeReK next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }
            if(isFirstPass){
                head = prev;
                isFirstPass=false;
            }
            else{
                prevFirst.next = prev;
            }
            prevFirst = first;
        }
        return head;
    }
}
class NodeReK{
    int data;
    NodeReK next;
    public NodeReK(int data){
        this.data = data;
    }
}
