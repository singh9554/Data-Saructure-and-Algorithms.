package Hashing;
import java.util.*;
public class LongestSubArrayOfBinaryArray{
    public static void main(String[] args) {
//        int []arr={1,0,1,1,1,0,0};
//        int []arr={1,1,1,1};
        int []arr={0,1,1,1,0,1,0,0,1,0,0};
//        System.out.println(LongestSubArray(arr));
        System.out.println(OpFindLongestSubArray(arr));
    }
//    Naive Solution , Time complexity is O(N^2) and space complexity O(1)
//    static int LongestSubArray(int []arr){
//        int n = arr.length;
//        int Longest = 0;
//        for(int i = 0; i < n ;i++){
//            int count0=0,count1=0;
//            for(int j = i; j < n ;j++){
//                if(arr[j] == 1){
//                    count1++;
//                }
//                else{
//                    count0++;
//                }
//                if(count0 == count1){
//                    Longest = Math.max(Longest,(count0+count1));
//                }
//            }
//        }
//        return Longest;
//    }
    //Optimized Solution O(N) and space Complexity O(N);
    static int OpFindLongestSubArray(int []arr){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int n = arr.length;
        for(int i = 0 ; i < n; i++){
            arr[i] = (arr[i]==0)? -1:1;
        }
        int PrefixSum = 0;
        int maxLength = 0;
        for(int i = 0 ; i < n ;i++){
            PrefixSum +=arr[i];
            if(PrefixSum == 0){
                maxLength = i + 1;
            }
            if(hm.containsKey(PrefixSum+n)){
                if(maxLength < i - hm.get(PrefixSum+n)){
                    maxLength = i - hm.get(PrefixSum+n);
                }
            }
            else{
                hm.put(PrefixSum+n,i);
            }
        }
        return maxLength;
    }
}
