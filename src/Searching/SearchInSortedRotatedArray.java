package Searching;
public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
        int []arr={10,20,30,40,50,8,9};
        int n = arr.length;
        int x = 30;
        System.out.println(searchRotate(arr,n,x));
    }
    static int searchRotate(int []arr,int n ,int x){
        int low = 0;
        int high = n - 1;
        while( low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] > arr[low]){
                if(x >= arr[low] && x < arr[mid])
                high = mid-1;
                else{
                    low = mid + 1;
                }
            }
            else{
              if(x <= arr[high] && x > arr[mid]){
                  low = mid + 1;
              }
              else{
                  high = mid - 1;
              }
            }
        } return -1;
    }
}
