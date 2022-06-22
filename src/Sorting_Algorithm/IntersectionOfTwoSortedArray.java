package Sorting_Algorithm;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArray {
    public static void main(String[]args){
    int []a={1,1,2,2,2};
    int []b={1,1,1,1,2,5,7};
        System.out.println(mergeIntersection(a,b));
//    intersection(a,b);
    }
//    static void intersection(int []a,int []b){
//        int m = a.length;
//        int n = b.length;
//        for(int i = 0 ; i < m ;i++){
//            if(i>0 && a[i]==a[i-1]){
//                continue;
//            }
//            for(int j = 0;j < n ; j++){
//                if(a[i]==b[j]){
//                    System.out.print(a[i]+" ");
//                    break;
//                }
//            }
//        }
//    }
    static ArrayList<Integer> mergeIntersection(int []a, int []b){
        ArrayList<Integer> List = new ArrayList<Integer>();
        int m = a.length;
        int n = b.length;
        int i = 0,j = 0;
        boolean flag = false;
        while(i < m  && j < n){
            if(i > 0 && a[i] == a[i-1]){
                i++;
                continue;
            }
            if(a[i]< b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            else {
                List.add(a[i]);
                flag= true;
                i++;j++;
            }
        }
        if(!flag){
            List.add(-1);
        }
        return List;
    }
}
