package Array;
import java.util.*;
public class CheckIfArraySorted {
    public static void main(String[]args){
        int []arr={8,9,10,12};
//        int []arr={200,100};
        int n = arr.length;
        System.out.println("Recursive solution: "+ checkSorted(arr,0,n));
        System.out.println("Iterative solution Time complexity O(n)^2: "+ checkSorted1(arr,n));
        System.out.println("Iterative solution Time complexity O(n): "+checkSorted2(arr,n));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    //Recursive solution;
    static boolean checkSorted(int []arr,int i ,int n){
        if(n == 1 || n == 0){
            return true;
        }

    if(checkSorted(arr,i+1,n-1) && arr[i] <= arr[i+1] ){
        return true;
    }
     return false;
    }
    //Iterative solution; Time complexity: O(n)^2;
    static boolean checkSorted1(int []arr,int n){
        int i,j;
        for(i = 0;i < n ;i++){
            for(j = i + 1;j < n; j++){
                if(arr[i]<=arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    //Iterative solution; Linear Time complexity: O(n);
    static boolean checkSorted2(int []arr,int n){
        int i;
        for(i = 1;i < n ;i++){
            if(arr[i - 1]<arr [i]){
                return true;
            }
        }
        return false;
    }
    static void reverse(int []arr ){
        int low = 0;
        int high = arr.length-1;

        while(low < high){
           int temp = arr[high];
            arr[high]=arr[low];
            arr[low]=temp;
            low++;
            high--;
        }
    }
}
