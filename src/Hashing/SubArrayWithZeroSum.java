package Hashing;
import java.util.HashSet;
public class SubArrayWithZeroSum {
    public static void main(String[] args){
        int []arr = {1,4,13,-3,-10,5};
//        int []arr={3,1,-2,5,6};
//        System.out.println(findZeroSum(arr));
        System.out.println(opFindZeroSum(arr));
    }
    static boolean findZeroSum(int []arr){
        int n = arr.length;
        for(int i = 0; i < n ;i++){
            int sum = 0;
            for(int j = i ; j < n ;j++){
                sum += arr[j];
                if(sum == 0){
                    return true;
                }
            }
        }
        return false;
    }
    //optimize solution with time complexity of O(N) space complexity O(1)
    static boolean opFindZeroSum(int []arr){
        int n = arr.length;
        HashSet<Integer> set = new HashSet<Integer>();
        int prefixSum=0;
        for(int i = 0; i < n; i ++){
            prefixSum +=arr[i];
            if(set.contains(prefixSum)){
                return true;
            }
            if(prefixSum == 0){
                return true;
            }
            set.add(prefixSum);
        }
        return false;
    }
}
