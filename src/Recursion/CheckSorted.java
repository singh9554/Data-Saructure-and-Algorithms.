package Recursion;
public class CheckSorted {
    public static void main(String[] args) {
        int [] arr={1,2,3,5,4,6};
//        int [] arr = {1,2,3,4,5,6};
        int n = arr.length;
        System.out.println(sorted(arr,0,n));
    }
    static boolean sorted(int []arr,int i ,int n){
        if(n == 0 || n == 1) return true;

         return (sorted(arr,i+1,n-1 ) && arr[i]<arr[i+1]);
    }
}
