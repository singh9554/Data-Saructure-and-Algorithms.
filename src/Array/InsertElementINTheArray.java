package Array;
import java.util.*;
public class InsertElementINTheArray {
    public static void main(String[]args){
        int []arr={5,10,20,0,0,0};
        int n = arr.length;
        int x1 = 7;
        int X2 = 4;
        int pos = 3;
        insert(arr,n,pos,x1);
        System.out.println(Arrays.toString(arr));
        end(arr,n,pos,X2);
        System.out.println(Arrays.toString(arr));

    }
    //This solution takes the time complexity of O(N) and Auxiliary Space complexity of O(1);
    static void insert(int []arr,int n , int pos, int x){
        int index = pos - 1;
        for(int i = n - 2;i >= index;i--){
            arr[i+1]=arr[i];
        }
        arr[index] = x;
    }
    static void end(int []arr,int n , int pos, int x){
//        int index = pos - 1;
        for(int i = n - 1;i >= 0;i--){
            if(arr[i] != 0){
                arr[i + 1] =x;
                break;
            }
        }

    }
}
