/*  Bubble Sort.
 * Bubble sort is a simple sorting Algorithm that works by repeatedly swapping the adjacent element,
 * if they are in wrong order.
 * Auxiliary space = O(1) ;
 * Time Complexity in best case O(n), it is when the array is sorted;
 * and the worst case time complexity is O(n^2).
 */
package Sorting_Algorithm;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args){
        int [] arr={5,3,2,4,1};
        int n = arr.length;
        Sort(arr,n);
    }
    static void Sort(int []arr,int n ){
        for(int i = 0 ;i < n -1;i++){
            boolean isSorted= true;
            for(int  j = 0;j< n-1 ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSorted = false;
                }
            }
            if(isSorted){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
