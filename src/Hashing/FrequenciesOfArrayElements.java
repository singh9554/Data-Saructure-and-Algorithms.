package Hashing;
import java.util.*;
public class FrequenciesOfArrayElements {
    public static void main(String[] args) {
        int []arr={10,12,10,15,10,20,12,12};
        int n = arr.length;
//        frequenciesOfArray(arr,n);
        OpFrequencyCount(arr);
    }
    //Naive solution with O(n *(n+n)) time complexity;
    static void frequenciesOfArray(int []arr,int n){
        for(int i = 0; i < n ; i++){
            boolean flag = false;
            for(int j =0;j < i ;j++){
                if(arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag) {
         continue;
            }
           int freq=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    freq++;
                }
            }
            System.out.println(arr[i]+" "+freq);
        }
    }
    //Efficient solution using HashMap; Time complexity is O(n), space complexity(n)
    static void OpFrequencyCount(int []arr){
        /*
         Note: HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
         // As HashMap used Hashing, it will print the key value pair in the unordered manner;
         //To print it in a proper order wil use LinkedHashMap;
           LinkedHashMap<Integer,Integer> h = new LinkedHashMap<Integer,Integer>();
         */
        LinkedHashMap<Integer,Integer> h = new LinkedHashMap<Integer,Integer>();
        for(int i : arr){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(int i :h.keySet()){
            System.out.println("Key "+ i + " value "+h.get(i));
        }
    }
}
