package Recursion;
public class PrintAllNumber {
    public static void main(String[] args) {
        int a =5;
        System.out.println("Before going to recursion");
        printBefore(a);
        System.out.println("after going to recursion");
        printAfter(a);
        System.out.println("Tail recursion");
        tail(a,1);
    }
    //Recursive Time complexity is T(n)=T(n-1)+O(n), space complexity=O(n);
    //This Method print before going to recursion;
    static void printBefore(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printBefore(n-1);
    }
    //Recursive Time complexity is T(n)=T(n-1)+O(n), space complexity=O(n);
    //This Method print after going to recursion;
    static void printAfter(int n){
        if(n == 0){
            return;
        }
        printAfter(n-1);
        System.out.println(n);
    }
    //Non-tail recursive method to recursive
    static void tail(int n,int k){
        if(n==0){
            return;
        }
        System.out.println(k);
        tail(n-1,k+1);
    }
}
