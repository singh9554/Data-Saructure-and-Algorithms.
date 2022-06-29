package Sorting_Algorithm;
import java.util.*;
public class MinimumDifferenceInAnArray {
    public static void main(String[]args){
        int [] arr={1,8,12,5,18};
//        int []arr={8,-1,0,3};
//        int []arr={8,15};
//        int []arr={10};
        int n = arr.length;
//        System.out.println(minimumDifference(arr,n));
        System.out.println(MinimumDifference(arr,n));
    }
    //Naive solution , Time complexity = O(n^2) space complexity O(1)
//    static int minimumDifference(int []arr,int n){
//        int Min = Integer.MAX_VALUE;
//        for(int i = 1;i<n;i++){
//            int diff = 0;
//            for(int j = 0; j < i; j++){
//                   if(arr[j]>arr[i]) {
//                       diff = arr[j] - arr[i];
//                       Min = Math.min(Min, diff);
//                   }
//                   else if(arr[i]>arr[j]){
//                       diff = arr[i] - arr[j];
//                       Min = Math.min(Min, diff);
//                   }
//            }
//        }
//        return Min;
//    }
    //---------------------------------
    //This is an Efficient Approach By simple sorting an Array. Time complexity is O(N LogN)
    static int MinimumDifference(int []arr,int n){
        int Min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = 0 ;i<n-1;i++){
            int diff = arr[i+1]-arr[i];
            Min=Math.min(Min, diff);
        }
        return Min;
    }
}
