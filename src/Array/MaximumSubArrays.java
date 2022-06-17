package Array;
import java.util.*;
public class MaximumSubArrays {
    public static void main(String[] args){
ArrayList<Integer> list = new ArrayList<>();
////        int [] arr={1, 2, 3 ,1, 4 ,5 ,2 ,3 ,6};
//        int []arr = {8,5,10, 7, 9, 4, 15, 12, 90, 13};
        int[]arr={9,5,6,7,8,10,12,13,14};
        int n = arr.length;
//        int k = 4;
        int k =3;
        System.out.print(list(arr,n,k));
        System.out.println();
        System.out.println(sub(arr,n,k));

//---------------Approach No 1--------------->>>>>>>>>>>>>>>>>>>

        for(int i = 0; i < n - k +1 ;i++){

            int Max = arr[i];
            for(int j = 0 ; j < k ; j++){
              if(Max< arr[i+j]){
                  Max = arr[i+j];
              }
            }
            System.out.print(Max+" ");
        }  System.out.print("");
        //----------------Approach number 2 ------------------>>>>>>>>>>
        for(int i = 0 ;i < n - k + 1; i++){
            int sum = 0;
            int Max = Integer.MIN_VALUE;
            for(int j = 0 ;j<k;j++){
                sum = arr[i+j];
                Max=Math.max(sum,Max);
            }
            list.add(Max);
        }
        System.out.println();
        System.out.print(list);

    }
    //------------------>>>>>>>>>>>...Approach Number 3----------->>>>>>>>>>>>>>>>>>
    static ArrayList<Integer> list(int [] arr,int n,int k){
        ArrayList<Integer> ans = new ArrayList<Integer>();
     Deque<Integer> qi = new ArrayDeque<>();
     for(int i = 0; i < n - k + 1;i++){
         qi.push(i);
         for(int j = 0;j < k ; j++){
             if(arr[i+j]>=arr[qi.peek()]){
                 qi.pop();
                 qi.push(i+j);
             }
         }
        ans.add(arr[qi.peek()]);
//         if (qi.peek() <= i - k) {
             qi.pop();
//         }
     }
         return ans;
    }
//------------<<<<<<<<<<<Approach No 4 ----------------->>>>>>>>>>>>>>>>>>
    static ArrayList<Integer> sub(int[]arr,int n , int k){
        ArrayList<Integer> out = new ArrayList<>();

        for(int i = 0; i < n-k+1;i++){
            int max = arr[i];
            for(int j = 0 ;j <k; j++){
                if(max<=arr[i+j]){
                    max=arr[i+j];
                }
            }
            out.add(max);
        }
        return out;
    }
//--------------------->>>>>>>>>>>>>>>>>>>>>---------------------<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
}
