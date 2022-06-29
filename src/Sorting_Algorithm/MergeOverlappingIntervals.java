package Sorting_Algorithm;
import java.util.*;
public class MergeOverlappingIntervals {
    public static void main(String[] args) {
   int []arr1={10,20};
   int []arr2={100,200};
        System.out.println(interval(arr1,arr2));
    }
    static boolean interval(int []arr1,int []arr2){
       if(arr1[0]<arr2[1]&&arr2[0]<arr1[1]){
           return true;
       }
       return false;
    }
}
