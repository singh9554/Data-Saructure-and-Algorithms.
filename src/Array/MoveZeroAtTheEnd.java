package Array;
import java.util.*;
public class MoveZeroAtTheEnd {
    public static void main(String[] args) {
int []arr={8,9,0,0,10,0,20};
int n = arr.length;
//array(arr,n);
        arrayOP(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    //It is a brute Force Approach with Time complexity of O(N) and Space complexity of O(N);
//    static void array(int[] arr,int n){
//        int[]temp=new int [n];
//        int index = 0;
//        for(int i = 0;i < n ; i++){
//            if(arr[i] != 0){
//                temp[index++]=arr[i];
//            }
//        }
//        for(int i = 0;i<n;i++){
//            if(arr[i]==0){
//                temp[index++]=arr[i];
//            }
//        }
//        arr=temp;
//        System.out.println(Arrays.toString(arr));
//    }
    //This is the optimized Approach to solve the problem With the Time Complexity of O(N) and Space Complexity of O(1);
    static void arrayOP(int []arr,int n){
        int index =0;
        for(int i = 0;i < n; i++){
            if(arr[i] != 0){
                arr[index++]=arr[i];
            }
        }
        for(int i = index;i < n; i++){
            arr[index++]=0;

        }
    }

}
