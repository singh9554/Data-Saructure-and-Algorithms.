package Hashing;
import java.util.*;
public class CountNonRepeatedElements {
    public static void main(String[] args) {
//int []arr={1,1,2,2,3,3,4,5,6,7};
       int []arr= {1, 4, 2 ,3 ,5 ,4};
int n = arr.length;
        System.out.println(count(arr,n));
    }
    static int count(int []arr,int n){
        Set <Integer> l = new HashSet<Integer>();
        for(int i = 0;i<n-1;i++){
            if(arr[i] != arr[i+1]){
                l.add(arr[i]);
            }
        }
        if(n == 1 || arr[n-1] != arr[n-2]){
            l.add(arr[n-1]);
        }
        int []arr1 = new int [n];
        for(int i = 0; i<n-1 ;i++){
            if(arr[i]==arr[i+1]){
                arr1[i]=arr[i];
            }
        }
        for(int i = 0;i<n-1;i++){
            if(l.contains(arr1[i])){
                l.remove(arr1[i]);
            }
        }
        System.out.println(l);
        return l.size();
    }
}
