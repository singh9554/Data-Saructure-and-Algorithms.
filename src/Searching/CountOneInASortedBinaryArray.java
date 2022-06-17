package Searching;
public class CountOneInASortedBinaryArray {
    public static void main(String[]args){
//        int []arr={0,0,0,1,1,1,1};
//        int []arr={1,1,1,1,1,1};
        int []arr={0,0,1,1,1,1,1,1,1,1};
//        int []arr={0,0,0,0,0};
        int n = arr.length;
//        System.out.println(bruteForce(arr,n));
        System.out.println(countOp(arr,n));
    }
    //Brute force Solution , T.c: O(n), SP: O(1);
//    static int bruteForce(int []arr,int n){
//        for(int i = 0; i < n - 1; i++){
//            if(arr[i] != arr[i +1 ]){
//                return (n - (i+1));
//            }
//        }
//        if(arr[0]==0){
//            return 0;
//        }
//        return n;
//    }

//Optimize Solution using Binary Search; T.C: O(log n), S.C: O(1);
static int countOp(int[]arr,int n){
        int low = 0;
        int high = n -1 ;
        while(low <= high){
            int mid = (low+high)/2;
            if(mid == 0 || arr[mid] != arr[mid -1]){
                return (n - mid);
            }
            else if(arr[mid] != 1){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        if(arr[0] == 0){
            return 0;
        }
        return n;
    }
}