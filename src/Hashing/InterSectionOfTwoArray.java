package Hashing;
import java.util.*;
public class InterSectionOfTwoArray{
    public static void main(String[] args) {
        int []a={5,10,15,5,10};
        int []b={15,5,5,10,4};
        int m = a.length;
        int n = b.length;
        System.out.println("Naive Solution "+findIntersection(a,b,m,n));
//        System.out.println(opfindIntersection(a,b));
    }
    //Naive solution time complexity O(n * (m+n))space : O(1);
    static int findIntersection(int[] a, int[] b,int m , int n ){
        int res = 0;
        for(int i = 0; i < m ; i++){
            boolean flag = false;
            for(int j = 0; j < i ; j++){
                if(a[i]==a[j]){
                    flag = true;
                    break;
                }
            }
            if(flag){
                continue;
            }
            for(int j = 0;j<n;j++){
                if(a[i]==b[j]){
                    res++;
                    break;
                }
            }
        }
        return res;
    }

    //Optimize solution,time complexity O(n+m) space = O(N);
    static int opfindIntersection(int []a,int []b){
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;
        for(int i : a){
            set.add(i);
        }
        for(int i : b){
            if(set.contains(i)){
                count++;
                set.remove(i);
            }
        }
        return count;
    }
}
