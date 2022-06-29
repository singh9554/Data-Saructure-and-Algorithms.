package Sorting_Algorithm;
import java.util.*;
public class ChocolateDistribution {
    public static void main(String[] args) {
   int []arr={7,3,2,4,9,12,56};
   int m =3;
   int n = arr.length;
        System.out.println(dis(arr,n,m));
    }
    //Time complexity is O(n log n);
    static int dis(int []arr,int n,int m){
   if(m>n){
       return -1;
   }
   Arrays.sort(arr);
   int res = Integer.MAX_VALUE;
   for(int i = 0; i < n-m+1;i++){
       res = Math.min(res,(arr[m+i-1]-arr[i]));
   }
   return res;
    }
}
