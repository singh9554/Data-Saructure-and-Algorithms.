package Hashing;
import java.util.*;
public class CountDistinctElementsInEveryWindow {
    public static void main(String[] args) {
   int []arr={10,10,5,3,20,5};
   int k = 4;
//   countDistinct(arr,k);
        opContDistinct(arr,k);
    }
    //Naive solution,
//    static void countDistinct(int []arr,int k){
//        int n = arr.length;
//        for(int i = 0; i < n - k + 1; i++){
//            int count = 0;
//            for(int j = 0 ; j < k ; j++){
//                boolean flag = false;
//                for(int p = 0 ; p < j;p++){
//                    if(arr[i+j]==arr[i+p]){
//                        flag = true;
//                        break;
//                    }
//                }
//                if (!flag) {
//                    count++;
//                }
//            }
//            System.out.print(count +" ");
//        }
//    }
    //Optimized solution, Time Complexity O(N) Space complexity O(N);
    static void opContDistinct(int []arr,int k){
        int n = arr.length;
        HashMap <Integer,Integer> hm = new HashMap<Integer,Integer>();

         for (int i = 0; i < k; i++) {
             hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
         }
         System.out.print(hm.size() + " ");
         for (int i = k; i < n; i++) {
             hm.put(arr[i - k], hm.get(arr[i - k] )- 1);
             if (hm.get(arr[i - k]) == 0) {
                 hm.remove(arr[i - k]);
             }
             hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
             System.out.print(hm.size() + " ");
         }
    }
}
