/*      Merge Sort
 * Like QuickSort, Merge Sort is a Divide and Conquer algorithm.
 * It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves.
 * The merge() function is used for merging two halves. The merge(arr, l, m, r) is a key process that assumes that arr[l..m] and arr[m+1..r]
 * are sorted and merges the two sorted sub-arrays into one.
 * MergeSort(arr[], l,  r)
 * If r > l
 *      1. Find the middle point to divide the array into two halves:
 *              middle m = (l+r)/2
 *      2. Call mergeSort for first half:
 *              Call mergeSort(arr, l, m)
 *      3. Call mergeSort for second half:
 *              Call mergeSort(arr, m+1, r)
 *      4. Merge the two halves sorted in step 2 and 3:
 *              Call merge(arr, l, m, r)
 *
 *              Time Complexity: O(nlog n)
 *               Space Complexity: O(n)
 */
package Sorting_Algorithm;
import java.util.*;
public class Merge_sort {
public static void main(String[] args){
int []arr={14,33,27,10,35,19,42,44};
int n = arr.length;
    Sort(arr,0,n-1);

}
static void merge(int []arr,int low,int mid, int high) {
int n1 = mid - low + 1;
int n2 = high - mid;
int []L=new int [n1];
int []R= new int [n2];
for(int i = 0;i<n1;i++){
    L[i]=arr[low+i];
}
for(int j =0 ;j<n2;j++){
    R[j]=arr[mid+j+1];
}
int i = 0,j=0;
int key = 0;
while(i < n1 && j < n2){
    if(L[i]<=R[j]){
        arr[key]=L[i];
        i++;
    }
    else{
        arr[key]=R[j];
        j++;
    }
    key++;
}
while(i < n1){
    arr[key]=L[i];
    key++;
    i++;
}
while(j < n2){
    arr[key]=R[j];
    key++;
    j++;
}

}
public static void Sort(int []arr,int low,int high) {
    if (low < high){
        int mid = low+(high-low)/2;//This is same as(low+high)/2 but this will control the overflow ,
        // for bigger array;
        Sort(arr,low,mid);
        Sort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    System.out.println(Arrays.toString(arr));
}
}

