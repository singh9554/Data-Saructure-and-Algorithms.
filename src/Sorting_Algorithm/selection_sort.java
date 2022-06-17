/*     SELECTION SORT;
 * The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.
 * 1) The subArray which is already sorted.
 * 2) Remaining subArray which is unsorted.
 * In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.
 * Following example explains the above steps:
 *
 *
 * arr[] = 64 25 12 22 11
 *
 * // Find the minimum element in arr[0...4]
 * // and place it at beginning
 * 11 25 12 22 64
 *
 * // Find the minimum element in arr[1...4]
 * // and place it at beginning of arr[1...4]
 * 11 12 25 22 64
 *
 * // Find the minimum element in arr[2...4]
 * // and place it at beginning of arr[2...4]
 * 11 12 22 25 64
 *
 * // Find the minimum element in arr[3...4]
 * // and place it at beginning of arr[3...4]
 * 11 12 22 25 64
 *
 */
package Sorting_Algorithm;
import java.util.*;
public class selection_sort {
public static void main(String[]args){
    int []arr = {5,4,10,3,9,2,1};
    int n = arr.length;
    Sorting(arr,n);
}
static void Sorting(int[]arr, int n){
    int i,j,min,temp;
    for( i = 0; i <n-1; i++){
        min = i;
        for(j = i +1 ;  j <n; j++){
            if(arr[j]<arr[min]){
                min = j;
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    System.out.println(Arrays.toString(arr));
}
}
