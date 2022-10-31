package Hashing;
import java.util.*;
public class LongestSubArrayWithGivenSum {
    public static void main(String[]args){
//        int []arr={5,8,-4,-4,9,-2,2};
//        int []arr={8,3,7};
//        int []arr={3,1,0,1,8,2,3,6};
        int[]arr={10,5,2,7,1,9};
//        int sum = 0;
//        int sum = 5;
        int sum = 15;
//        System.out.println(FindLongestSubArray(arr,sum));
        System.out.println(OpFindLongestSubArray(arr,sum));
    }
    //Naive Solution Time complexity O(N^2) and Space Complexity O(1);
    static int FindLongestSubArray(int[]arr,int sum){
        int Longest=0;
        int n = arr.length;
        for(int i = 0; i < n ;i++){
            int currSum = 0,count=0;
            for(int j = i; j < n ;j++){
                currSum += arr[j];
                count++;
                if(currSum == sum){
                    if(count > Longest){
                        Longest = count;
                    }
                }
            }
        }
        return Longest;
    }
    //Optimize solution , Time complexity O(N) and Space Complexity O(N);
    static int OpFindLongestSubArray(int []arr,int sum){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int res = 0,prefixSum=0,n = arr.length;
        for(int i = 0; i < n ;i++){
            prefixSum +=arr[i];
            if(prefixSum == sum){
                res = i + 1;
            }
            if(map.containsKey(prefixSum)==false){
                map.put(prefixSum,i);
            }
            if(map.containsKey(prefixSum-sum)){
                res = Math.max(res,i - map.get(prefixSum-sum));
            }
        }
        return res;
    }
}
