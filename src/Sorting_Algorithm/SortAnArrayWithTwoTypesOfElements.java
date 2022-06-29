package Sorting_Algorithm;
import java.util.*;
public class SortAnArrayWithTwoTypesOfElements {
    public static void main(String[] args) {
        int[] arr = {15, -3, -2, 18};
        int n = arr.length;
//        sort(arr, n);
        SortArray(arr,0,n-1);
    }
    //Naive solution;
//    static void sort(int[]arr,int n){
//        int index = 0;
//        int []temp = new int[n];
//        for(int i = 0;i < n; i++){
//            if(arr[i]<0){
//            temp[index++]=arr[i];
//            }
//        }
//        for(int i = 0;i<n;i++){
//            if(arr[i]>0){
//                temp[index++]=arr[i];
//            }
//        }
//        arr=temp;
//        System.out.println(Arrays.toString(arr));
//    }
    // Efficient approach using Quick Sort;
    //function to display the Array;
    static void Display(int []arr){
        for(int i :arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    //step swap function;
    static void swap(int []arr,int v1,int v2){
        int temp = arr[v2];
        arr[v2]=arr[v1];
        arr[v1]=temp;
    }
    //Make a partition function;
    static int partition(int []arr,int low,int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    //sort function;
    static void SortArray(int []arr,int low , int high){
        if(low<high){
            int pi = partition(arr,low,high);
            Display(arr);
            SortArray(arr,low,pi-1);
            SortArray(arr,pi+1,high);
        }
    }

}
