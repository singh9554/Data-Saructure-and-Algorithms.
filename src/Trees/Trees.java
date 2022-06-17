package Trees;
import java.util.*;
public class Trees {
    static Scanner sc=null;
    public static void main(String[]args){
        sc=new Scanner(System.in);
        Node root=createTree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        System.out.println("The height of the Binary tree is " +height(root));
        System.out.println("The size of a Binary tree is "+size(root));
        System.out.println("The highest order of node in the Binary Tree "+maximum(root));
        System.out.println("The lowest order of node in the Binary Tree "+minimum(root));

    }
    static Node createTree(){
        Node root;
        System.out.println("Enter data ");
        int data=sc.nextInt();
        if(data==-1) return null;
        root=new Node(data);
        System.out.println("Enter left for "+data);
        root.left=createTree();
        System.out.println("Enter right for "+data);
        root.right=createTree();
        return root;
    }
    static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    // To find height we have to find number of nodes between root node and leaf node in a Binary tree;
   static int height(Node root){
        if(root==null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
   }
   // TO find size we have to find the total number of nodes available in a Binary Tree;
   static int size(Node root){
        if(root==null) return 0;
        return size(root.left)+size(root.right)+1;
   }
   //To find maximum we have to find that which node hold the largest data value;
   static int maximum(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));
   }
   //To find minimum we have to find that which node hold the lowest data value;
    static int minimum(Node root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.data,Math.min(minimum(root.left),minimum(root.right)));
    }
}
class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
    }
}

