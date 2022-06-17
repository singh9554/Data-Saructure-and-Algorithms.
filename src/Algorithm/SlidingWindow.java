package Algorithm;
public class SlidingWindow {
    //----------------------------------------------------------------------------------------
    // Bruteforce solution;  Time complexity: O(n*k);
    //----------------------------------------------------------------------------------------
    static int MaxSum(int[]arr,int n,int k){
        int Max=Integer.MIN_VALUE;
        for(int i = 0 ; i < n-k+1 ; i++){
            int curr_sum = 0;
            for(int j = 0 ; j < k ; j++)
                curr_sum += arr[i + j];
            Max=Math.max(Max,curr_sum);
        }
        return Max;
    }

//    ----------------------------------------------------------------------------------------
    //Optimized solution; Time Complexity: O(n);
    //----------------------------------------------------------------------------------------
    static int WinSum(int[] arr, int n, int k) {
        int Max_sum = 0;
        for (int i = 0; i < k; i++) {
            Max_sum += arr[i];
        }
        int WinSum = Max_sum;
        for (int i = k; i < n; i++) {
            WinSum += arr[i] - arr[i - k];
        }
        Max_sum = Math.max(WinSum, Max_sum);
        return Max_sum;
    }
    public static void main(String[]args){
        int [] arr = {1,4,2,10,2,3,1,0,20};
        int n = arr.length;
        int k = 4;
        System.out.println("By Bruteforce approach: "+MaxSum(arr,n,k));
        System.out.println("By Optimize approach: "+WinSum(arr , n , k));
    }
}
