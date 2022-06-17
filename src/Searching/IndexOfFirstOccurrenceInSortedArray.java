package Searching;
public class IndexOfFirstOccurrenceInSortedArray {
    public static void main(String[] args) {
        int[]arr={1,10,10,10,20,20,40};
//        int []arr={10,20,30};
//        int []arr={15,15,15};
        int n = arr.length;
        int x = 20;
//        int x = 15;
//        System.out.println(indexFirst(arr,n,x));
//        System.out.println(recursiveApproach(arr,0,n-1,x));
        System.out.println(iterativeApproach(arr,n,x));
    }
    //This is a brute Force solution, Time complexity is O(n)and space complexity is O(1);
//    static int indexFirst(int[]arr,int n,int x){
//        for(int i = 0; i < n; i++){
//             if(arr[i]==x){
//                 return i;
//             }
//        }
//        return -1;
//    }
    //-----------------------------------------------------------------------------------------
    //Recursive approach by using Binary Search; It's Time complexity if O(log n) and space complexity O(log n),
//    static int recursiveApproach(int []arr,int low,int high,int x){
//        if(low>high){
//            return -1;
//        }
//        int mid = (low+high)/2;
//       if(arr[mid]<x){
//            return recursiveApproach(arr,mid+1,high,x);
//        }
//        else if (arr[mid]>x){
//           return recursiveApproach(arr,low,mid-1,x);
//        }
//        else{
//           if(mid == 0 || arr[mid - 1] != arr[mid]){
//               return mid;
//           }
//           else{
//               return recursiveApproach(arr,low,mid-1,x);
//           }
//       }
//    }
    //--------------------------------------------------------------------
    // Iterative solution;
    static int iterativeApproach(int []arr,int n , int x){
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                if(mid == 0 || arr[mid - 1] != arr[mid]){
                    return mid;
                }
                else{
                    high = mid - 1;
                }
            }
            else if (arr[mid] < x){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }

}
