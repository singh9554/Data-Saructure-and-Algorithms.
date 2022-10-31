package Hashing;
import java.util.*;
public class LongestCommonSpanWithSameSumInBinaryArray{
    public static void main(String[] args) {
      int []a={0,1,0,0,0,0};
      int []b={1,0,1,0,0,1};
//        System.out.println(findLongestSubArray(a,b));
        System.out.println(OpFindLongestSubArray(a,b));
    }
    //Naive Solution Time complexity O(N^2) and Space Complexity O(1);
//    static int findLongestSubArray(int []a,int []b){
//     int res = 0;
//     int n = a.length;
//     for(int i = 0; i < n ;i++){
//         int sumA=0,sumB=0;
//         for(int j = i; j < n ;j++){
//             sumA +=a[j];
//             sumB +=b[j];
//             if(sumA == sumB){
//                 res = Math.max(res,j - i + 1);
//             }
//         }
//     }
//     return res;
//    }
    //Optimize solution Time complexity O(N) and space Complexity O(N);
    static int OpFindLongestSubArray(int []a,int []b){
        int n = a.length;
        int []arr=new int [n];
        for(int i = 0; i < n;i++){
            /*
            //Remember this concept because some time a and b will be declared as boolean array;
            Note : a[i]=0 and b[i]=1 then arr[i]= -1
                  a[i]=1 and b[i]=0 then arr[i]= 1
                  a[i]=0 and b[i]=0 then arr[i]= 0
            */
            arr[i]=a[i] - b[i];
        }
        int sum = 0;
        int min_len=0;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0; i<n ;i++){
            sum +=arr[i];
            if(sum == 0){
                min_len = i + 1;
            }
            if(hm.containsKey(sum)){
                min_len = Math.max(min_len,i - hm.get(sum));
            }
            else{
                hm.put(sum,i);
            }
        }
        return min_len;
    }
}
