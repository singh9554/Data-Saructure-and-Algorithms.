package Array;
public class EquilibriumPoint {
    public static void main(String[] args) {
//     int []arr={0,3,4,8,-9,20,6};
//     int[]arr={1,3,5,2,2};
        int []arr={4,2,-2};
//        int []arr = {4,2,2};
     int n = arr.length;
        System.out.println(equilibriumPoint(arr,n));
    }
    static boolean equilibriumPoint(int []arr,int n){
        for(int i = 0 ; i < n ;i++){
            int sum1 = 0;
            int sum2 = 0;
            for(int j = 0 ; j < i; j++){
                sum1 +=arr[j];
            }
            for(int k = i+1; k < n ;k++){
                sum2 +=arr[k];
            }
            if(sum1 == sum2){
                System.out.println(arr[i]+ " ");
                return true;
            }
        }
        return false;
    }
}
