//Mean And Median Of Array;
package Array;
import java.util.*;
public class MeanAndMedianOfArray {
    public static void main(String[]args){
        int []arr={1,2,19,28,5};
//        int []arr = {2,8,3,4};
        int n = arr.length;
        System.out.println(mean(arr,n));
        System.out.println(median(arr,n));

    }
    static int mean (int []arr,int n){
        int sum = 0;
        int count =0;
        for(int i = 0 ; i < n ; i++){
            sum = sum + arr[i];
            count++;
        }
        return (sum/count);
    }
    static int median(int []arr,int n){
        Arrays.sort(arr);
        int low = 0;
        int high = n - 1;
        while(low <= high){
            if(low == high){
                return arr[low];
            }
            low++;
            high--;
        }
        return (int)((arr[low]+arr[high])/2);
    }

}
