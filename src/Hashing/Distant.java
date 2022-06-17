/*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<------------------------------------------
    Count the distant element in every window of size K;
    arr[]={1,2,2,1,3,1,1,3};
    key=4;
    ------------------------------------------------>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
 */
package Hashing;
import java.util.*;
public class Distant {
static void countDistant(int[] arr,int n,int k){
    HashMap<Integer,Integer> Map=new HashMap<>();
    for(int i = 0 ; i < k ; i++){
        Map.put(arr[ i ],Map.getOrDefault(arr[ i ], 0) + 1);
    }
    System.out.println(Map.size());
    for(int i = k ;i < n ; i++){
        if(Map.get(arr[i-k])==1) {
            Map.remove(arr[i - k]);
        }
        else
            Map.put(arr[i-k],Map.get(arr[i-k])-1);
        {
            Map.put(arr[i], Map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(Map.size());
    }
}
public static void main(String []args){
    //Declare the array;
    int []arr={1,2,2,1,3,1,1,3};
    //size of the array;
    int n=arr.length;
    //window sliding size;
    int k=4;
    countDistant(arr , n , k);
}
}
