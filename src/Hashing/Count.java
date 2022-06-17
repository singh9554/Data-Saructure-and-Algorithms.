package Hashing;
import java.util.*;
public class Count{
    static void SubArray(int[]arr,int sum){
        int Current = 0;
        int start = 0 ;
        int end = -1;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            Current +=arr[i];
            if(Current - sum == 0){
                start = 0;
                end = i;
                break;
            }
            if(map.containsKey(Current - sum)){
                start = map.get(Current - sum) + 1;
                end = i;
                break;
            }
            map.put(Current,i);
        }
        if(end == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println(start+","+end);
        }
    }
    public static void main(String[]args){
        int[]arr={10,15,-5,15,-10,5};
        int sum=5;
        SubArray(arr,sum);
    }
}
