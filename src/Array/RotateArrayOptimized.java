/*     Rotated Array;
This is an optimized solution to Rotate an array ;
which takes O(N) time complexity;
and O(1) space complexity;

 */
package Array;
import java.util.*;
public class RotateArrayOptimized {
    public static void main(String[]args){
        int []arr={1,2,3,4,5};
        int n = arr.length;
        int d = 22;
        rotate(arr,n ,d);
        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int[] arr, int n,int d){
        while(d>n){
            d=d-n;
        }
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    static void reverse(int []arr,int low,int high){
        while(high > low){
            int temp = arr[low];
            arr[low]= arr[high];
            arr[high]= temp;
            low++;
            high--;
        }

    }
}
