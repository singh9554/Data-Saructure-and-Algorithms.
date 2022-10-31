package Hashing;
import java.util.*;
public class PairWithGivenSumInUnsortedArray {
    public static void main(String[] args) {
//        int []arr={3,2,5,15,-8};
        int []arr={2,1,6,3};
//        int []arr={5,8,-3,6};
//        System.out.println(naiveFindPair(arr,3));
//        System.out.println(naiveFindPair2(arr,3));
        System.out.println(hashingApproach(arr,6));
    }
    //Naive Approach using Two pointer Approach , Time Complexity : O(n log n), space Complexity O(1)
    static boolean naiveFindPair(int []arr,int sum){
        Arrays.sort(arr);
        boolean ans = false;
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            if(arr[start] + arr[end] == sum){
                ans = true;

            }
            else if(arr[start] + arr[ end ] > sum){
                end--;
            }
            else{
                start++;
            }
        }
        return ans;
    }
    //Naive Approach Time Complexity : O(n^2), space Complexity O(1);
    static boolean naiveFindPair2(int []arr,int sum){
        for(int i = 0; i < arr.length ;i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]+arr[j] == sum){
                    return true;
                }
            }
        }
        return false;
    }
    //Optimized Approach Time complexity:O(n),space Complexity(O(n));
    static boolean hashingApproach(int[]arr,int sum){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : arr){
            if(set.contains(sum-i)){
                return true;
            }
            else{
                set.add(i);
            }
        }
        return false;
    }
}
