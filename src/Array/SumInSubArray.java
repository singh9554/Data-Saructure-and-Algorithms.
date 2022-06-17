/* Find the SubArray with given sum, if any;
 */
package Array;
public class SumInSubArray {
    public static void main(String[] args) {
//        int [] arr = {1,8,30,-5,20,7};
        int []arr= {1,4,20,3,10,5};
        int n = arr.length;
        int k = 33;
        System.out.println(present(arr,n,k));
        System.out.println(check(arr,n,k));
    }
    //This is a brute force approach with time complexity of O(N^2) and space complexity of O(1);
    static boolean present(int []arr,int n,int k){
        for(int i = 0;i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += arr[j];
                if(sum == k){
                    return true;
                }
            }
        }
        return false;
    }
    // This is an Optimized approach to solve the current problem ;
    // which has the time complexity of O(N) and space complexity of (1);
    static boolean check(int []arr,int n,int k){
       int start = 0;
       int end = 1;
       int currSum = arr[start];
       for(; end < n; end++){
           while(currSum > k && start < end - 1){
               currSum -= arr[start];
               start++;
           }
           if(currSum == k) {
               return true;
           }
          else{
               currSum += arr[end];
           }
       }
       return (currSum == k);
    }
}
