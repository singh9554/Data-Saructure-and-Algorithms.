package Array;
import java.util.*;
public class LeaderInAnArray {
    public static void main(String[] args){
int []arr = {7,10,4,10,6,5,2};
int n = arr.length;
Leader1(arr,n);
System.out.println();
Leader2(arr,n);
    }
    //This solution take Time complexity of O(N^2) and Space complexity of O(1)
    static void Leader1(int []arr, int n){
        for(int i = 0 ;i < n ; i++){
            boolean flag = false;
            for(int j = i + 1 ; j < n;j++){
                if(arr[i] <= arr[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.print(arr[i]+" ");
            }
        }
    }
    //This is  optimized solution which takes Time complexity of O(N) and space complexity of O(1);
    static void Leader2(int []arr,int n) {
        int current = arr[n - 1];
        System.out.print(current + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (current < arr[i]) {
                current = arr[i];
                System.out.print(current + " ");
            }
        }

    }
    //This is optimized solution using HashSet which takes Time complexity of O(N) and space complexity of O(N);
//    static void Leader2UsingSet(int []arr,int n) {
//     HashSet<Integer> hs = new HashSet<>();
//     for(int i : arr){
//         hs.add(i);
//     }
//     for(int i = 0 ; i < n ; i++){
//         if(hs.contains(arr[i])){
//
//         }
//     }
//    }
}
