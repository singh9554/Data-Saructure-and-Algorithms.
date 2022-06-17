package Array;
import java.util.*;
public class PrefixSum {
    public static void main(String[] args) {
    int []arr={3,6,5,10,9,2};
    int n = arr.length;
prefixSum(arr,n);
    }
    static void prefixSum(int []arr,int n ){
        int []prefixSum=new int [n];
        prefixSum [0] = arr[0];
        for(int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(prefixSum));
      Quires(prefixSum);
    }
    static void Quires(int[]prefixSum){
        int [][]q={{0,2},{1,4},{2,5}};
        int m = q.length;
        for(int i = 0;i < m;i++){
            int l = q[i][0];
            int r = q[i][1];
            if(l == 0){
                System.out.println(prefixSum[r]+" ");
            }
            else if(l > 0) {
                System.out.println(prefixSum[r] - prefixSum[l - 1] + " ");
            }
        }
    }

}
