package Hashing;
import java.util.*;
public class CountNumberOfBadPairs {
    public static void main(String[] args) {
     int []nums={4,1,3,3};
        System.out.println(countBadPairs1(nums));
        System.out.println(countBadPairs(nums));
    }
    //Naive Approach Time complexity is O(N^2) and space complexity O(1);
    public static long countBadPairs1(int[] nums) {
       int res = 0;
       int n = nums.length;
       for(int i = 0; i < n;i++){
           for(int j = i+1;j < n;j++){
               if(j - i != nums[j] - nums[i]){
                   res++;
               }
           }
       }
       return res;
    }
    //Efficient Approach where Time complexity is O(N) and Space Complexity O(N);
    public static long countBadPairs(int[] nums){
        HashMap<Long,Long> map = new HashMap<Long,Long>();
        long n = nums.length;
        long ans = n*(n-1)/2;
        for(long i = 0; i<n;i++){
            map.put(nums[(int)i]-i,map.getOrDefault(nums[(int)i]-i,(long)0)+1);
        }
        for(Map.Entry<Long,Long> entry : map.entrySet()){
            ans = ans - (entry.getValue()*(entry.getValue()-1)/2);
        }
        return ans;
    }
}
