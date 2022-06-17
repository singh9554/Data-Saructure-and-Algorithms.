package Recursion;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        int n = arr.length;
        Sort(arr,n);
        print(arr);
    }
    static void Sort(int []arr,int n){
        if(n == 0 || n == 1) return;
        for(int i = 0; i < n-1 ;i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i + 1];
                arr[i + 1] =arr[i];
                arr[i] = temp;
            }
        }print(arr);
        System.out.println();
        Sort(arr,n-1);
    }
    static void print(int []arr){
        for(int e: arr){
            System.out.print(e+" ");
        }
    }
}
