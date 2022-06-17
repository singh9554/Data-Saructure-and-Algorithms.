package Array;
import java.util.*;
public class MinimizetheHeightsI {
    public static void main(String[] args) {
int []arr={1,5,8,10};
int n = arr.length;
int k = 2;
        System.out.println(mod(arr,n,k));
    }
    static int mod(int []arr,int n,int k){
        Arrays.sort(arr);
        int max, min;
        if(n == 1){
            return 0;
        }
        int diff = arr[n-1]-arr[0];
        for(int i = 1 ;i < n;i++){
            max = Math.max(arr[i-1]+k,arr[n-1]-k);
            min = Math.min(arr[0]+k,arr[i]-k);
            diff = Math.min(diff,max-min);

        }
        return diff ;
    }
}
