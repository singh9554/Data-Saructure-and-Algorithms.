package Array;
import java.util.*;
public class FrequenciesInAnArray {
    public static void main(String[] args) {
//        int[] arr = {10, 10, 10, 25, 30, 30};
        int []arr={10,10,10,30,30,40};
//        int []arr = {10,10,10,10};
//        int []arr = {10,20,30};
        int n = arr.length;
        frequency1(arr, n);
        System.out.println();
        frequency2(arr,n);
    }
//This solution takes time complexity of O(N) and space complexity of O(1),
    static void frequency1(int[] arr, int n) {
       int freq = 1;
       int i = 1;
       while(i < n){
           while( i < n && arr[i] == arr[i - 1]){
               freq++;
               i++;
           }
           System.out.println(arr[i - 1]+" : "+freq);
           i++;
           freq = 1;
       }
       if(n == 1 || arr[n-1] != arr[n-2]) {
           System.out.println(arr[n-1]+" : "+freq);
       }
    }
    //This solution takes time complexity of O(N) and space complexity of O(1),
    static void frequency2(int []arr,int n){
        int count = 1;
        int temp = arr[0];
        for(int i = 1 ;i < n ; i++){
            if(temp == arr[i]){
                count++;
                continue;
            }
            if(temp != arr[i]){
                System.out.println(arr[i-1]+" : "+count);
                temp = arr[i];
                count = 1;
            }
        }
        if(n == 1 || arr[n-1] != arr[n-2]){
            System.out.println(arr[n-1]+" : "+count);
        }
    }
}