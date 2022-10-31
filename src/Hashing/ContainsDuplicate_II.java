package Hashing;
import java.util.*;
public class ContainsDuplicate_II {
    public static void main(String[] args) {
  int []nums = {1,2,3,1,2,3};
  int k = 2;
        System.out.println(containsNearbyDuplicate1(nums,k));
        System.out.println(containsNearbyDuplicate(nums,k));
    }
    //Naive Approach Time complexity is O(n^2) and space complexity is O(1);
    public static boolean containsNearbyDuplicate1(int[] nums, int k){
        int n = nums.length;
        for(int i = 0 ; i < n ;i++){
            int abs = 0;
            boolean flag = false;
            for(int j = i+1; j < n;j++){
                if(nums[i] == nums[j]){
                    abs = j - i;
                    flag = true;
                    break;
                }
            }
            if(abs <= k && flag ){
                return true;
            }
        }
        return false;
    }
    //Efficient Approach Time complexity is O(N) And Space complexity is O(N)(Used HasMap).
    public static boolean containsNearbyDuplicate(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int n = nums.length;
        int val = 0;
        for(int i = 0; i < n ;i++){
            boolean flag = false;
            if(map.containsKey(nums[i])){
                val = i - map.get(nums[i]);
                flag = true;
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+i);
            if(val <= k && flag){
                return true;
            }
        }
        return false;
    }
}
