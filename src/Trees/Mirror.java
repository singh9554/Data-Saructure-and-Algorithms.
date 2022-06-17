package Trees;
import java.util.*;
public class Mirror {
    static Scanner sc=null;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        box root=makeTree();
        System.out.println("The root of the binary tree is "+root.data);
        System.out.println("Inorder of original binary tree: ");
        inorder(root);
        System.out.println();
        System.out.println("Inorder of Mirror binary tree: ");
        mirror(root);
        minorder(root);
    }
    static box makeTree(){
        box root;
        System.out.println("Enter data ");
        int data= sc.nextInt();
        if(data==-1)return null;
        root= new box(data);
        System.out.println("Enter left for "+data);
        root.left=makeTree();
        System.out.println("Enter right for "+data);
        root.right=makeTree();
        return root;
    }
    static void inorder(box root){
        if(root==null)return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    static void mirror(box root){
        if(root==null)return;
        root.temp=root.left;
        root.left=root.right;
        root.right=root.temp;

    }
    static void minorder(box root){
        if(root==null)return;
        minorder(root.left);
        System.out.print(root.data+" ");
        minorder(root.right);
    }
}
class box{
    int data;
    box left,right,temp;
    public box(int data){
        this.data=data;
    }
}