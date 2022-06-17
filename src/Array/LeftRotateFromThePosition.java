package Array;
import java.util.*;
public class LeftRotateFromThePosition {
    public static void main(String[]args){
    int []arr={1,2,3,4,5,6,7,8,9,10};
    int n = arr.length;
    int d = 2;
        System.out.println(Arrays.toString(arr));
//        rotate1(arr,n,d);
//        rotate2(arr,n ,d);
        rotate3(arr,n,d);
        System.out.println(Arrays.toString(arr));
    }
    //This approach takes Time complexity of O(n-d+d) which is equals to O(n+d) and we can say
    //d is smaller than or equal to n , so actual time complexity is O(N), and Space Complexity is O(N), taking
    //N size temp array;
    static void rotate1(int[]arr,int n,int d){
        int []temp = new int [n];
        int index = 0;
        for(int i = d; i < n; i++){
            temp[index++]=arr[i];
        }
        for(int i = 0 ; i < d ; i++){
            temp[index++]=arr[i];
        }
        arr = temp;
        System.out.println(Arrays.toString(arr));
    }
    //This approach takes Time complexity of O(n-d+d) which is equals to O(n+d) and we can say
    //d is smaller than or equal to n , so actual time complexity is O(N), and Space Complexity is O(d), taking
    //d size temp array;
    static void rotate2(int[]arr,int n,int d){
        int []temp = new int [d];
        for(int i = 0; i < d; i++){
            temp[i]=arr[i];
        }
        for(int i = d ; i < n ; i++){
            arr[i - d] = arr[i];
        }
        for(int i = 0;i < d; i++){
            arr[n - d + i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    // This is the optimized approach among all It's time complexity is O(d+n-d+n)
    //O(2n) which is O(n), so the actual time complexity is O(n) and space complexity is O(1);
    static void rotate3(int []arr,int n,int d){
        while(d>n){
            d=d-n;
        }
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
     static void reverse(int [] arr,int  low, int high){
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
     }

}
