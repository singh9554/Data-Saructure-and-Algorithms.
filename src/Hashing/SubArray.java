package Hashing;
import java.util.*;
public class SubArray {
    static void sub_Array_sum(int []arr,int sum){
        HashMap<Integer,Integer> map=new HashMap<>();
       int currsum=0;
        int start=0;
        int end=-1;
        for(int i=0;i<arr.length;i++) {
            currsum += arr[i];
            if (currsum - sum == 0) {
                start = 0;
                end = i;
                break;
            }
            if (map.containsKey(currsum - sum)) {
                start = map.get(currsum - sum) + 1;
                end = i;
                break;
            }
            map.put(currsum, i);
        }
            if (end == -1) {
                System.out.println("Not found");
            } else {
                System.out.println(start + "," + end);

        }
    }
    public static void main(String[]args){
        int []arr={10,15,-5,15,-10,5};
        int sum=5;
        sub_Array_sum(arr,sum);
    }
}
