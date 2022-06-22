//This is hoare partition of Quick sort.
package Sorting_Algorithm;
public class QSort {
public static void main(String[]args){
int []arr={50,25,92,16,76,30,43,54,19};
int n = arr.length;
sorting(arr,0,n-1);
}
static void Display(int []arr){
    for(int i : arr){
        System.out.print(i+" ");
    }
    System.out.println();
}
static void swap(int[]arr,int v1,int v2){
    int temp = arr[v1];
    arr[v1]=arr[v2];
    arr[v2]=temp;
}
static int Partition(int[]arr,int low,int high){
    int l = low;
    int r= high;
    int pivot = arr[low];
    while(l <= r){
        while(arr[l]<=pivot){
            l++;
        }

        while(arr[r]>pivot){
            r--;
        }
        if(l<r){
            swap(arr,l,r);
        }
    }
    arr[low]=arr[r];
    arr[r]=pivot;
    return r;
}
static void sorting(int []arr,int low,int high){
    if(low < high){
        int pi = Partition(arr,low,high);
        Display(arr);
        sorting(arr,low,pi-1);
        sorting(arr,pi+1,high);
    }
}
}

