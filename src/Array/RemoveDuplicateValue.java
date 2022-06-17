package Array;
import java.util.*;
public class RemoveDuplicateValue {
    public static void main(String[]args){
        int []arr={10,20,20,30,30,30,30};
        int n = arr.length;
//        System.out.println(removeDuplicateValue(arr,n));
//        System.out.println(Arrays.toString(arr));
        System.out.println(removeDuplicateValue1(arr,n));
        System.out.println(Arrays.toString(arr));
    }
    //Naive solution; which takes time complexity of O(n) and Space complexity (n)
    static int removeDuplicateValue(int []arr,int n){
int []temp = new int[n];
temp[0]=arr[0];
int res = 1;
for(int i = 1;i < n ; i++){
    if(temp[res - 1] != arr[i]){
        temp[res]=arr[i];
        res++;
    }
}
for(int i = 0 ; i < n; i++){
    arr[i]=temp[i];
}
return res;
    }
    //Optimize solution of this problem which takes, Time complexity of O(n) and Space complexity of O(1);
    static int removeDuplicateValue1(int []arr,int n){
        int res = 1;
        for(int i = 1 ; i < n ;i++){
            if(arr[res-1] != arr[i]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }
}
