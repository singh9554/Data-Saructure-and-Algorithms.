package Searching;
public class BinarySearchIterative {
    public static void main(String[] args) {
        int []arr={3,4,5,6,7,8};
        int n = arr.length;
        System.out.println(binarySearch(arr,n,7));
    }
    static int binarySearch(int []arr,int n,int x){
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] < x){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
