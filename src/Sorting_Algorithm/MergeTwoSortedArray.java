package Sorting_Algorithm;
import java.util.*;
public class MergeTwoSortedArray {
    public static void main(String[] args){
        int []a={10,15,20};
        int []b={5,6,6,15};
//        int []a={1,1,2};
//        int []b={3};
        merge(a,b);
    }
    static void merge(int []a,int []b){
        int s1 = a.length;
        int s2= b.length;
        int i = 0,j=0,k=0;
        while(i < s1 && j < s2){
            if(a[i]<=b[j]){
                System.out.print(a[i]+" ");
                i++;
            }
            else{
                System.out.print(b[j]+" ");
                j++;
            }
            k++;
        }
        while(i < s1){
            System.out.print(a[i]+" ");
             i++;
             k++;
        }
        while(j < s2){
            System.out.print(b[j]+" ");
            j++;
            k++;
        }
    }
}
