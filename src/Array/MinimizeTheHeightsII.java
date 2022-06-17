package Array;
import java.util.*;
public class MinimizeTheHeightsII {
    public static void main(String[] args) {
//        int []arr = {1,5,8,10};
//        int [] arr = {3, 9, 12, 16, 20};
        int []arr={2,6,3,4,7,2,10,3,2,1};
        int n = arr.length;
//        int k = 3;
//        int k =2;
        int k =5;
        System.out.println(modify(arr,n,k));
    }
    static int  modify(int []arr,int n,int k){
        if (n==1){
            return 0;
        }
        Arrays.sort(arr);
        int max=0, min=0;
        int diff=Integer.MAX_VALUE;
        for(int i = 1;i < n;i++){
            if(arr[i] - k < 0){
                continue;
            }
            max= Math.max(arr[i-1]+k,arr[n-1]-k);
            min= Math.min(arr[0] + k , arr[i] - k);
            diff=Math.min(diff,max-min);
        }
        return diff;
    }
}
