package Hashing;
import java.util.*;
public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 4, 2, 20};
//        int []arr={1,3,9,2,8,2};
//        int []arr={1,3,4,3,3,2,9,10};
//        int []arr={8,20,7,30};
//        int []arr={20,30,40};
        System.out.println(longestSubsequence(arr));
//        System.out.println(opFindLongestSubsequence(arr));
    }
    //Naive solution , Time Complexity O(n log n) and space Complexity O(1)
    static int longestSubsequence(int []arr){
        int n = arr.length;
        Arrays.sort(arr);
        int ans = 0;
        int count = 1;
        for(int i = 0 ; i < n-1; i++){
            if(arr[i]+1 == arr[i+1]){
                count++;
            }
            else if(arr[i] + 1 != arr[i + 1]){
                ans = Math.max(ans,count);
                count=1;
            }
        }
        return Math.max(ans,count);
    }
    // Optimize approach using HashSet; Time complexity O(N) and space complexity O(N);
    static int opFindLongestSubsequence(int []arr){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : arr){
            set.add(i);
        }
        int ans = 0;
        for(int i : set){
           if(set.contains(i - 1) == false){
               int cur = 1;
               while(set.contains(i + cur)){
                   cur++;
               }
               ans = Math.max(ans, cur);
           }
        }
        return ans;
    }
}
