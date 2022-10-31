package Array;
import java.util.*;
public class MakeArrayZeroBySubtractingEqualAmounts {
    public static void main(String[] args) {
int [] nums = {1,5,0,3,5};
        System.out.println(minimumOperations(nums));
    }
   static int minimumOperations(int[] nums) {
     int res = 0;
     int n = nums.length;
     Arrays.sort(nums);
     int []temp =new int [n];
 for(int i = 0; i < n ;i++){
         int j = 0;
         while(j < n){
             if(temp[j]!=0){
                 temp[j] -=nums[i];
             }
             j++;

         res++;
     }
     nums=temp;
 }

     return res;
    }
}
