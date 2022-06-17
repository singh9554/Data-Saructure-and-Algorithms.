package Searching;
public class FindAPeakElement {
    public static void main(String[] args) {
     int []arr = {5,10,20,15,7};
//        int []arr={10,20,15,5,23,90,67};
//        int []arr={80,70,90,67};
//        int[]arr={80,70,60};
        int n = arr.length;
        System.out.println(findElement(arr,n));
    }
    //Idea of the approach is Binary Search, Time Complexity: O(log n) Space Complexity: O(1);
    static int findElement(int []arr,int n){
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if((mid == 0 || arr[mid] >= arr[mid -1])&&(mid == n-1 || arr[mid] >= arr[mid+1])){
                return arr[mid] ;
            }
            else if(mid > 0 && arr[mid] <= arr[mid-1]){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
