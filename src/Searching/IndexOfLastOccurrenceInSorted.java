package Searching;
public class IndexOfLastOccurrenceInSorted {
    public static void main(String[] args) {
//   int []arr={10,15,20,20,40,40};
//   int []arr={5,8,8,10,10};
   int []arr={4,6,8,10,10,11,15,20};
//        int[] arr = {8, 10, 10, 12};
        int n = arr.length;
//   int x = 20;
//   int x = 10;
//        int x = 7;
        int x = 8;
//        System.out.println(bruteForce(arr, n, x));
//        System.out.println(recursiveApproach(arr,0,n-1,x));
        System.out.println(iterativeApproach(arr,n,x));
    }

    //Brute force Approach, Time complexity O(n) Space Complexity O(1)
//    static int bruteForce(int[] arr, int n, int x) {
//        for (int i = n - 1; i >= 0; i--) {
//            if (arr[i] == x) {
//                return i;
//            }
//        }
//        return -1;
//    }

    //Recursive Approach By using Binary Search,
    // Time Complexity O(log n) and Space Complexity O(log n);
//    static int recursiveApproach(int[] arr, int low, int high, int x) {
//        int n = arr.length;
//        if (low > high) {
//            return -1;
//        }
//        int mid = (low + high) / 2;
//        if(arr[mid] < x){
//            return recursiveApproach(arr,mid+1,high,x);
//        }
//        else if(arr[mid] > x){
//            return recursiveApproach(arr,low,mid-1,x);
//        }
//        else{
//            if(arr[mid] == x){
//                if(mid == n-1 || arr[mid] != arr[mid + 1]){
//                    return mid;
//                }
//                else{
//                    return recursiveApproach(arr,mid+1,high,x);
//                }
//            }
//        }
//        return -1;
//    }
    //Iterative Approach By using Binary Search,
    // Time Complexity O(log n) and Space Complexity O(1);
    static int iterativeApproach(int []arr,int n,int x){
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                if(mid == n-1 || arr[mid] != arr[mid+1]){
                    return mid;
                }
                else{
                    low = mid + 1;
                }
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
