package PrefixSum;

public class FindPivotIndex {
    public static void main(String[]args){
  int []arr={1,7,3,6,5,6};
//  int []arr={1,2,3};
        System.out.println(pivotIndex(arr));
    }
    //Time Complexity of the function is O(N) and Space complexity is O(N) (for extra preSum array)
    public static int pivotIndex(int[] nums) {
       int n = nums.length;
       int []preSum = new int[n];
       preSum[0]=nums[0];
       for(int i = 1; i < n;i++){
       preSum[i] = preSum[i-1]+nums[i];
       }
       int right = n-1;
       if(preSum[0]-preSum[right]==0 || preSum[right]-preSum[0]==0){
           return 0;
       }
       for(int i = 1; i < n;i++){
           if(preSum[right] - preSum[i] == preSum[i-1]){
               return i;
           }
       }
        return -1;
    }
}
