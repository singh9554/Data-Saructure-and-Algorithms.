package Hashing;
import java.util.*;
public class ContDistinct {
    public static void main(String[] args) {
//        int []arr={4,5,5,5,10,4};
//        int []arr={5,10,5,4,5,10};
//        int []arr={3,4,5};
//        int []arr={5,5,5};
//        int []arr={5,10,15,5,4,5};
        int []arr={10,20,10,20,30};
        int n = arr.length;
        System.out.println("Naive Solution " +contDistinct(arr,n));
        System.out.println("Naive 2nd Solution "+cont(arr,n));
        System.out.println("Optimize solution "+ opContDistinct(arr));
    }
    //Naive solution, Time complexity o(n Log N), Space complexity O(1);
    static int contDistinct(int []arr,int n ){
        Arrays.sort(arr);
        int m = arr[0];
        int count = 1;
        for(int i = 1; i < n ; i++) {
            if (arr[i] == m) {
              m = arr[i];
              continue;
            }
            else{
                count++;
                m = arr[i];
            }
        }
        return count;
    }
//Naive solution O(N^2) time complexity;  Space complexity O(1);
    static int cont(int []arr,int n){
        int res=0;
        for(int i = 0; i < n ; i++){
            boolean flag = false;
            for (int j = 0; j < i ; j++){
                if(arr[i]==arr[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                res++;
            }
        }
        return res;
    }
    //-----------------------------------------------------
    // Efficient solution using HashSet;  O(N) time complexity;  Space complexity O(N);
    static int opContDistinct(int []arr){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : arr){
            set.add(i);
        }
        return set.size();
    }
}
