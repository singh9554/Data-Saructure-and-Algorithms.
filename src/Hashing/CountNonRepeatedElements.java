package Hashing;
import java.util.*;
public class CountNonRepeatedElements {
    public static void main(String[]args){
        int []arr={1,1,2,2,3,3,4,5,6,7};
        int n = arr.length;
//        System.out.println(countNonRepeated(arr,n));
        System.out.println(opCountNonRepeated(arr));
    }
    //Naive Approach Time complexity O(n^3) and space complexity is O(1)
//    static long countNonRepeated(int []arr, int n)
//    {
//        // add your code
//        long count = 0;
//        for( int i = 0 ; i < n;i++){
//            boolean flag = false;
//            for(int j = i+1 ; j < n ; j ++){
//                if(arr[j] == arr[i]){
//                    flag = true;
//                    break;
//                }
//            }
//            for(int k = 0 ; k < i ; k++){
//                if(arr[i]==arr[k]){
//                    flag = true;
//                    break;
//                }
//            }
//            if(!flag ){
//                count++;
//            }
//        }
//        return count;
//    }

//Optimize Solution TimeComplexity is O(N) and Space complexity O(N)
    static long opCountNonRepeated(int []arr){
        int n = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i : arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        long count=0;
        for(int i = 0 ; i < n ; i++){
            if(hm.get(arr[i])==1){
                count++;
            }
        }
        return count;
    }

}
