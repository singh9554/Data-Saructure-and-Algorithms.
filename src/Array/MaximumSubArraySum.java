/* The optimized approach of this problem is Based on Kadane's algorithm
*  Which has The Time complexity of O(N) and Space Complexity of O(1) */
package Array;
public class MaximumSubArraySum {
    public static void main(String[] args) {
//        int [] arr = {-6,-1,-8};
//        int []arr={5};
//        int []arr = {-9,-5,-6,-2,-4,-7,-3,-10};
//        int [] arr = {5,8,3};
        int[] arr = {1, -2, 3, -1, 2};
//        int []arr = {2,3,-8,7,-1,2,3};
        int n = arr.length;
        System.out.println("Brute force solution : "+maximumSum1(arr, n));
        System.out.println("Kadane's algorithm : "+maximumSum2(arr,n));
    }
//This is a Brute force approach Which takes the time complexity of O(N^2), space complexity of O(1);
    static int maximumSum1(int[] arr, int n) {
    int res =Integer.MIN_VALUE;
    for(int i = 0 ; i < n; i++){
        int sum = 0;
        for(int j = i;j<n;j++){
            sum = sum + arr[j];
            res = Math.max(res, sum);
        }
    } return res;
    }
    // This is an optimized solution which takes the time complexity of O(N) and space complexity of O(1)
    // Based on Kadane's algorithm;
    static int maximumSum2(int []arr,int n){
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for(int i = 0; i < n;i++){
            curr = curr + arr[i];
            if(curr > max){
                max = curr;
            }
            if(curr < 0){
                curr = 0;
            }
        }
        return max;
    }
}
