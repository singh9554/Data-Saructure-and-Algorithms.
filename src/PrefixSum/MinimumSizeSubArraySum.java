package PrefixSum;
import java.util.*;
public class MinimumSizeSubArraySum {
    public static void main(String[]args){
int []arr={1,2,3,4,5};
        System.out.println(minSubArrayLen(11,arr));
    }
    //Time complexity is O(n) and space complexity is O(1)
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        for(int i = 0 ; i < n;i++){
            sum += nums[i];
            while(sum >= target){
                res =Math.min(res,(i - left + 1));
                sum -=nums[left];
                left++;
            }
        }
        return res!=Integer.MAX_VALUE?res:0;
    }
}

