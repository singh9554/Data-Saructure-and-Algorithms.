package Hashing;
import java.util.*;
public class MoreThanNByKOccurences {
    public static void main(String[] args) {
    int []arr={30,10,20,20,10,20,30,30};
        int k = 4;
//        int []arr={10,10,20,30,20,10,10};
//    int k = 2;
//    FindOccurrences(arr,k);
//        opFindOccurrences(arr, k);
        printNByK(arr,k);
    }
    //Naive Approach Time complexity is O(N Log N) and space complexity O(1);
    static void FindOccurrences(int []arr,int k) {
    Arrays.sort(arr);
    int n = arr.length;
    int m = n/k;
    int count = 1;
    int i = 1;
    while(i<n){
        while(i < n && arr[i]==arr[i-1]){
            count++;
            i++;
        }
        if(count > m){
            System.out.print(arr[i-1]+" ");
        } count=1;
        i++;
    }
    }
    //Efficient approach using HashMap Time complexity is O(N) and space complexity O(N);
     static void opFindOccurrences(int []arr,int k){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
           if(entry.getValue()>n/k){
               System.out.print(entry.getKey()+" ");
           }
        }
     }
//     More Efficient approach using HashMap Time complexity is O(N*K) and space complexity O(N);
    static void printNByK(int arr[], int k){
        HashMap <Integer,Integer> hm = new HashMap<Integer,Integer>();
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            if(hm.containsKey(arr[i])){
                int count = arr[i];
                hm.put(arr[i],count+1);
            }
            else if(hm.size() < k-1){
                hm.put(arr[i],1);
            }
            else{
                for(Map.Entry x:hm.entrySet()){
                    Integer c = (Integer)x.getValue();
                    hm.put((Integer)x.getKey(),c-1);
                    if((Integer)x.getKey()==0){
                        hm.remove(x.getKey());
                    }
                }
            }
        }
        for(Map.Entry x:hm.entrySet()){
            int count = 0;
           for(int i = 0 ; i < n;i++){
               if((Integer)x.getKey()==arr[i]){
                   count++;
               }
           }
           if(count > n/k){
               System.out.print(x.getKey()+" ");
           }
        }
    }
    }

