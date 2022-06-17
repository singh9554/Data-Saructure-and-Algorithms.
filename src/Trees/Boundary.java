package Trees;
import java.util.*;
public class Boundary {
    static Scanner sc=null;
    public static void main(String[]args){
        sc=new Scanner(System.in);
        Tres root=CreateTree();
        System.out.println("The root of a binary Tree is "+root.data);
        BoundaryPrint(root);
        System.out.println();
    }
    static Tres CreateTree(){
        Tres root;
        System.out.println("Enter data ");
        int data=sc.nextInt();
        if(data==-1)return null;
        root=new Tres(data);
        System.out.println("Enter left for "+data);
        root.left=CreateTree();
        System.out.println("Enter right for "+data);
        root.right=CreateTree();
        return root;
    }
    static void BoundaryPrint(Tres root){
        if(root==null)return;
        System.out.print(root.data+" ");
        //Print left Boundary in a topdown manner.
        BoundaryTransversal_left(root.left);
        //print the leaf of the Binary tree;
        leafNode(root.left);
        leafNode(root.right);
        //Print the right Boundary in a bottom up manner;
        BoundaryTransversal_right(root.right);
    }
    static void BoundaryTransversal_left(Tres root){
        if(root==null)return;
        if(root.left!=null){
            BoundaryTransversal_left(root.left);
            System.out.print(root.data+" ");
        }
        else if(root.right!=null){
            BoundaryTransversal_left(root.right);
            System.out.print(root.data+" ");
        }
    }
    static void BoundaryTransversal_right(Tres root){
        if(root==null)return;
        if(root.right!=null){
            BoundaryTransversal_right(root.right);
            System.out.print(root.data+" ");
        }
        else if (root.left != null) {
            BoundaryTransversal_right(root.left);
            System.out.print(root.data+" ");
        }
    }
    static void leafNode(Tres root){
        if(root==null)return;
        leafNode(root.left);

        if(root.left!=null && root.right!=null) {
            System.out.print(root.data +" ");
        }
        leafNode(root.right);
    }

}
class Tres{
    int data;
    Tres left,right;
    public Tres(int data){
        this.data=data;
    }
}
