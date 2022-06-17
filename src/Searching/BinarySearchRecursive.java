package Searching;
public class BinarySearchRecursive {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int n = arr.length;
        System.out.println(binarySearch(arr,0,n-1,4));
    }
    static int binarySearch(int[]arr,int low,int high ,int x){
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid] == x){
            return mid;
        }
        else if(arr[mid] < x){
           return binarySearch(arr,mid+1,high,x);
        }
        else{
            return binarySearch(arr,low,mid-1,x);
        }
    }
}
