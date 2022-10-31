package Hashing;
import java.util.*;
public class TwoSum {
    public static void main(String[]args){
int [] num={2,7,11,15};
int target = 9;
// int []num = {3,2,4};
// int target = 6;
//   int []num={3,3};
//   int target = 6;
TwoSum obj = new TwoSum();
obj.twoSum(num,target);

    }
    public void twoSum(int[] num, int target) {
        int n = num.length;
        int []arr= new int [2];
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int index=0;
        for(int i = 0 ; i < n ; i++){
            if(hm.containsKey(target-num[i])){
             arr[index++] = i;
             arr[index] = hm.get(target-num[i]);
            }
           hm.put(num[i],i);
        }
        System.out.println(Arrays.toString(arr));
    }
}

