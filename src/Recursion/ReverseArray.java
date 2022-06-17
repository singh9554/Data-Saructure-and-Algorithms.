package Recursion;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
int [] arr={5,4,3,2,1};
int start = 0;
int end = arr.length-1;
Reverse(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }
    static void Reverse(int []arr,int start,int end){
        if(start == end) return;
        if(start<=end){
          int temp = arr[end];
          arr[end]=arr[start];
          arr[start]=temp;
         Reverse(arr,start+1,end-1);
        }
    }
}
