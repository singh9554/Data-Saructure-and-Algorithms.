package Sorting_Algorithm;
import java.util.*;
public class KthSmallestElement {
    public static void main(String[]args){
//        int []arr={10,5,30,12};
        int []arr={30,20,5,10,8};
        int k = 4;
//        System.out.println(NaiveApproach(arr,k));
        System.out.println(kthSmallestElement(arr,k));
    }
    //This is a Naive Approach Two solve this problem, Time complexity = 0(n log n);
//    static int NaiveApproach(int []arr,int k){
//        Arrays.sort(arr);
//        return arr[k-1];
//    }
    //Swap Function;
    static void swap(int[]arr,int v1,int v2){
        int temp = arr[v2];
        arr[v2]=arr[v1];
        arr[v1]=temp;
    }
    //Write Quick sort partition method;
    static int partition (int []arr,int low,int high){
        int pivot = arr[high];
        int l = low-1;
        int r = high-1;
     for(int j=low;j<=r;j++){
         if(arr[j]<pivot){
             l++;
             swap(arr,l,j);
         }
        }
     swap(arr,l+1,high);
        return l+1;
    }
    //Let us solve the problem with efficient Approach using Quick Select Algorithm;
    //time complexity=O(n log n),time complexity is worst case= O(n^2);
    static int kthSmallestElement(int[]arr,int k){
        int n = arr.length;
        int l = 0;
        int r = n-1;
        while(l <= r) {
            int pi = partition(arr, l, r);
            if (pi == k - 1) {
                return arr[pi];
            } else if (pi > k - 1) {
                r = pi - 1;
            } else {
                l = pi + 1;
            }
        }
        return -1;
    }
}

