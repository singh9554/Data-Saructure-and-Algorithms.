package Array;
import java.util.*;
public class LeftRotateTheArray {
    public static void main(String[]args){
        int []arr = {1,2,3,4,5};
//        int []arr = {30,5,20};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        Rotate(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    //Time complexity of this approach is O(N) and Space Complexity of this approach is O(1);
    static void Rotate(int []arr,int n ){
        int temp = arr[0];
        for(int i = 1; i < n; i++){
            arr[ i - 1 ] = arr[ i ];
        }
        arr[ n - 1 ] = temp;
    }
}
