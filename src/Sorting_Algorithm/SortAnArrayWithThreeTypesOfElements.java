package Sorting_Algorithm;
import java.util.*;
public class SortAnArrayWithThreeTypesOfElements {
    public static void main(String[] args) {
     int []arr={0,0,1,2,1,1,2,1,2};
     int n = arr.length;
//     sort(arr,n);
        SortArray(arr,n);
    }
    //Naive Approach, Time complexity is O(N) and space Complexity O(N);
//    static void sort(int []arr,int n){
//        int index = 0;
//        int []temp= new int[n];
//        for(int i = 0 ; i < n ; i++){
//            if(arr[i]==0){
//                temp[index++]=arr[i];
//            }
//        }
//        for(int i = 0 ; i < n ; i++){
//            if(arr[i]==1){
//                temp[index++]=arr[i];
//            }
//        }
//        for(int i = 0 ; i < n ; i++){
//            if(arr[i]==2){
//                temp[index++]=arr[i];
//            }
//        }
//        arr=temp;
//        System.out.println(Arrays.toString(arr));
//    }
    //Efficient Approach of this problem by,
    //Dutch National Flag Algorithm;
    //swap function;
    static void swap(int []arr,int v1,int v2){
        int temp = arr[v2];
        arr[v2]=arr[v1];
        arr[v1]=temp;
    }
    //Dutch National Flag Algorithm Function;
    static void SortArray(int []arr,int n){
        int low = 0,mid = 0,high = n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
