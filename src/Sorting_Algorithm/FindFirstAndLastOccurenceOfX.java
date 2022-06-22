package Sorting_Algorithm;
import java.util.*;
public class FindFirstAndLastOccurenceOfX{
    public static void main(String[]args){
        long []arr={1,3,5,5,5,5,67,123,125};
        int n = arr.length;
        int x = 5;
        System.out.println(findPositionOfX(arr,n,x));
    }
    static ArrayList<Long> findPositionOfX(long []arr,int n,int x){
        long temp1=Long.MIN_VALUE,temp2=Long.MIN_VALUE;
        //long temp1=-1;temp2=-1;

        ArrayList<Long> list= new ArrayList<>();

        for(int i=0;i<n;i++){
            if(arr[i]==x){
                temp1=i;
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                temp2=i;
            }
        }
        if(temp1!=Long.MIN_VALUE&&temp2!=Long.MIN_VALUE){
            list.add(temp1);
            list.add(temp2);
        }
        else
        {
            list.add((long)-1);
            list.add((long)-1);

        }
        return list;
    }
}
