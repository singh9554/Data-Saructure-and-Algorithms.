package Dynamic_Programming;
import java.util.*;
public class HouseRobbery {
    static int []dp = new int [105];
    //TopDown or Memoization solution;
    static int houseRobberTD(int i , int[] nums){
        if(i == 0){
            return nums[0];
        }
        if(i == 1){
            return Math.max(nums[0],nums[1]);
        }
        if(dp[i] != -1){
            return dp[i];
        }
        return dp[i]=Math.max(houseRobberTD(i-1,nums),nums[i]+houseRobberTD(i-2,nums));
    }
    //Bottom Down or Tabulation;
    static int houseRobberBD(int []arr){
        int n = arr.length;
        if(n == 0){
            return arr[0];
        }
        if(n == 1){
            return Math.max(arr[0],arr[1]);
        }
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i = 2; i < n;i++){
            dp[i]=Math.max(dp[i-1],arr[i]+dp[i-2]);
        }
        return dp[n-1];
    }
    public static int rob(int[] nums) {
        Arrays.fill(dp,-1);
        int n = nums.length;
//        return houseRobberTD(n-1,nums);
        return houseRobberBD(nums);
    }
    public static void main(String[]arga){
       int []arr={2,7,9,3,1};
        System.out.println(rob(arr));
    }

}
