package Sorting_Algorithm;
import java.util.*;
public class MaximumMeetingGuest {
    public static void main(String[] args){
        int []arr={900,600,700};
        int []dep={730,800,1000};
        int n = arr.length;
        int m = dep.length;
        System.out.println(maximumGuest(arr,dep,n,m));
    }
    static int maximumGuest(int []arr,int []dep,int n , int m){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 1,j = 0,res=1,curr=1;
        while(i < n && j < m){
            if(arr[i]<=dep[j]){
                curr++;
                i++;
            }
            else{
                curr--;
                j++;
            }
            res = Math.max(res,curr);
        }
        return res;
    }
}
