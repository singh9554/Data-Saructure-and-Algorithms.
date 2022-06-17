package Array;
public class MaximumDifferences {
    public static void main(String[] args){
        int []arr = {2,3,10,6,4,8,1};
//        int []arr = {7,9,5,6,3,2};
//        int []arr = {10,20,30};
//        int []arr = {30,10,8,2};
//        int []arr={-7,-10,-2,1,8,-3};
        int n = arr.length;
        System.out.println("Answer of First Method: " +maximum1(arr,n));
        System.out.println("Answer of Second Method: " +maximum2(arr,n));

    }
    //This solution takes Time complexity of O(N^2) and space complexity of O(1);
    static int maximum1(int []arr,int n){
        int Max = Integer.MIN_VALUE;
        for(int i = 0; i < n ;i++){
            for(int j = i + 1; j < n; j++){
                int val = arr[j] - arr[i];
                Max = Math.max(Max,val);
            }
        }
        return Max;
    }//This is Optimized solution which takes Time complexity of O(N) and Space complexity of O(1);
    static int maximum2(int []arr,int n){
        int Max = Integer.MIN_VALUE;
        int minValue = arr[0];
        for(int j = 1 ; j < n ; j++){
            Max = Math.max(Max,arr[j]-minValue);
            minValue = Math.min(minValue,arr[j]);
        }
        return Max;
    }
}
