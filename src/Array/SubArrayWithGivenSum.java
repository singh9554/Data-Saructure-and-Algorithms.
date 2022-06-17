package Array;
import java.util.*;
public class SubArrayWithGivenSum {
    public static void main(String[]args){
//        int []arr={1,2,3,4,5,6,7,8,9,10};
        int []arr={1,2,3,7,5};
//        int []arr={1,2,4,5,6};
//        int []arr={135 ,101 ,170 ,125 ,79 ,159 ,163 ,65 ,106 ,146 ,82 ,28 ,162 ,92, 196 ,143 ,28 ,37 ,192 ,5 ,103 ,154 ,93 ,183 ,22 ,117 ,119 ,96 ,48 ,127 ,172 ,139 ,70 ,113 ,68 ,100 ,36 ,95 ,104 ,12 ,123 ,134};
        int n = arr.length;
        int sum =12;
        System.out.println(index(arr,n,sum));
        }
        static ArrayList<Integer> index(int []arr,int n,int s){
            ArrayList<Integer> list = new ArrayList<>();
            int startIndex=0;
            int endIndex=0;
            int sum =0;
           for(; endIndex<n;endIndex++){
               sum +=arr[endIndex];
               while(sum > s){
                   sum -=arr[startIndex++];
               }
               if(sum == s){
                   list.add(startIndex+1);
                   list.add(endIndex+1);
                   return list;
               }
           }

               list.add(-1);

           return list;
        }
        }


