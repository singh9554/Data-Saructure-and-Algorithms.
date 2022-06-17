/*<<<<<<<<<<<<-----------Create a Binary Tree and perform the insertion and deletion function------------->>>>>>>>>>>>>
        --------------------------------------
        |           4                        |
        |         /  \                       |
        |       2     6                      |
        |     /  \   / \                     |
        |   1     3 5   7                    |
         ------------------------------------
        Code this Binary Tree;
*/
//---------------------------------------------------------------------------------------------------------------------
package BinarySearchTree;
import java.util.*;
public class insertion {
    static Scanner sc=null;
public static void main(String[]args){
    //Creating the Scanner object;
    sc=new Scanner(System.in);
    //Call the CreateTree method;
   Node root=CreateTree();
    System.out.println("The root of the binary tree is "+root.data);
    //Call the inorder method for original tree;
    System.out.println("Inorder of original Binary Tree");
    inorder(root);
    System.out.println();
    //Enter the value of search key;
    System.out.println("Enter the key to search");
    int key=sc.nextInt();
    //Call the search method;
    if(Search(root,key)==null){
        System.out.println("The Key does not Exists in Binary search tree");
    }
    else{
        System.out.println("The key Exists in the Binary Search Tree");
    }
    System.out.println("Enter the key to delete: ");
    int key_b= sc.nextInt();
    //Calling the Deleting method;
    DeleteNode(root,key_b);
    System.out.println("Print the modify tree: ");
    inorder(root);
}
//<<<<<<<<<<<<<<<<<<<<---------------------Creating a Binary Search Tree--------------------->>>>>>>>>>>>>>>>>>>>>>>>
    static Node CreateTree(){
    Node root;
        System.out.println("Enter data");
        int data=sc.nextInt();
        if(data==-1)return null;
        root=new Node(data);
        System.out.println("Enter left for "+data);
        root.left=CreateTree();
        System.out.println("Enter right for "+data);
        root.right=CreateTree();
        return root;
    }
    //<<<<<<<<<<<<<<<<<<<<------------------Inorder of Binary Search Tree--------------------->>>>>>>>>>>>>>>>>>>>>>>>
    static void inorder(Node root){
    if(root==null)return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    //<<<<<<<<<<<<<<<<<<<<------------------Search element in Binary Search Tree-------------------->>>>>>>>>>>>>>>>>>
    static Node Search(Node root,int key) {
    //Base case for root null;
        if(root==null){
            return null;
        }
    //key is present at root;
        if (root.data == key)
            return root;
        //condition to check greater element;
          if (root.data<key) {
            return Search(root.right, key);
        }
          //condition to check smaller element;
          return Search(root.left, key);
    }
    //<<<<<<<<<<<<<<<<<<<<--------------Deleting element from Binary Search Tree-------------------->>>>>>>>>>>>>>>>>>
//Delete Node method;
    static Node DeleteNode(Node root,int key){
    if(root==null){
        return null;
    }
    if(root.data==key){
        return helper(root);
    }
    Node minV=root;
    while(root!=null){
        if(root.data>key){
            if(root.left!=null && root.left.data==key){
                root.left=helper(root.left);
                break;
            }
            else{
                root=root.left;
            }
        }
        else{
            if(root.right!=null && root.right.data==key){
                root.right=helper(root.right);
                break;
            }
            else{
                root=root.right;
            }
        }
    }
    return minV;
    }
static Node helper(Node root){
    if(root.left==null){
        return root.right;
    }
    else if(root.right==null){
        return root.left;
    }
    Node rightChild=root.right;
    Node lastRight=findLastRight(root.left);
    lastRight.right=rightChild;
    return root.left;
}
static Node findLastRight(Node root){
    if(root.right==null){
        return root;
    }
    return findLastRight(root.right);
}
    }
    //Creating a Node class for Binary Search Tree;
class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
    }
}
//---------------------------------------------------------------------------------------------------------------------