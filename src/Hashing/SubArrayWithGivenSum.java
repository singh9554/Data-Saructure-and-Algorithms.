package Hashing;
import java.util.*;
public class SubArrayWithGivenSum {
    public static void main(String[] args){
        int []arr={5,8,6,13,3,-1};
        int sum = 11;
//        System.out.println(findSubArray(arr,sum));
        System.out.println(OpFindSubArray(arr,sum));
    }
    //Naive solution, Time complexity : O(n^2) and space complexity O(1);
    static boolean findSubArray(int []arr,int sum){
        int n  = arr.length;
        for (int i = 0 ; i < n ;i++){
            int checksum = 0;
            for(int j = i;j < n ;j++){
                checksum +=arr[j];
                if(checksum == sum){
                    return true;
                }
            }
        }
        return false;
    }
    //Optimize Approach; Time complexity of O(N), Space complexity O(N);
    static boolean OpFindSubArray(int[] arr,int sum){
        HashSet<Integer> set = new HashSet<>();
        int prefixSum=0;
        for(int i : arr){
            prefixSum +=i;
            if(set.contains(prefixSum - sum)){
                return true;
            }
            if(prefixSum == sum){
                return true;
            }
            else{
                set.add(prefixSum);
            }
        }
        return false;
    }

}
