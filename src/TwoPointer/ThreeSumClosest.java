package TwoPointer;
import java.util.*;
public class ThreeSumClosest {
    public static void main(String[]args){
   int []arr={0,0,0};
   int target = 1;
        System.out.println(threeSumClosest(arr,target));
    }
    public static int threeSumClosest(int[] nums, int target) {
 Arrays.sort(nums);
 int n = nums.length;
 int diff = Integer.MAX_VALUE;
 int res = 0;
 for(int i = 0 ; i < n-2 ;i++){
     int low = i+1, high = n-1;
     int a = nums[i];
     while (low < high) {
     if (a+nums[low]+nums[high] == target) {
     return a+nums[low]+nums[high];
         }
     else if(Math.abs(a+nums[low]+nums[high]-target) < diff){
     diff = Math.abs(a+nums[low]+nums[high]-target);
     res = a+nums[low]+nums[high];
         }
     else if (a+nums[low]+nums[high] > target) {
     high--;
             }
     else {
     low++;
             }
         }
     }
 return res;
    }
}
