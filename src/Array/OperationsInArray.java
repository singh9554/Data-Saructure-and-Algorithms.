package Array;
import java.util.*;
public class OperationsInArray {
    public static void main(String[] args) {
        //Insert operation;

        int []arr= {5,10,20,2,5};
        int n = arr.length;
        int x =5;
//        int pos = 2;
//        int idx = pos -1;
//        for(int i = n-1;i>=idx;i--){
//            arr[i]=arr[i-1];
//        }
//        arr[idx]=x;
//        System.out.println(arr.length);
//        System.out.println(Arrays.toString(arr));
        //Delete Operation in Array;
//
//        int[] arr = {5, 10, 20, 2, 5};
//        int n = arr.length;
//        int x = 5;
////        int pos = 2;
////        int idx = pos -1;
//        int j = 0;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == x) {
//                j++;
//                break;
//            }
//        }
//        for (int k = j + 1; k < n - 1; k++) {
//            arr[k] = arr[k + 1];
//        }
//        arr[n - 1] = 0;
//        System.out.println(arr.length);
//        System.out.println(Arrays.toString(arr));
        System.out.println(Deletearr(arr,n,x));
        System.out.println(Arrays.toString(arr));
    }
static int Deletearr(int []arr,int n,int x){
        int i = 0;
    for( i = 0 ;i < n; i++){
        if(arr[i]==x){
            break;
        }
    }
    if(i == n){
        return n;
    }
    for(int j = i;j<n-1;j++){
        arr[j]=arr[j+1];
    }
    arr[n-1]=0;
    return(n-1);
        }
    }

