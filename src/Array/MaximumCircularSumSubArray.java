package Array;
public class MaximumCircularSumSubArray {
    public static void main(String[] args) {
        int [] arr= {8,-4,3,-5,4};
//        int []arr={-12,-14};
        int n = arr.length;
//        System.out.println(circularMax(arr,n));
        System.out.println(kadane(arr,n));
    }
//    static int normalArray(int []arr, int n){
//        int Max = Integer.MIN_VALUE;
//        int count = 0;
//        for(int i = 0; i < n; i++){
//            count = count + arr[i];
//            if(count > Max){
//                Max = count;
//            }
//            if(count < 0 ){
//                count = 0;
//            }
//        }
//        return Max;
//    }
//    static int circularMax(int []arr,int n){
//        int normal = normalArray(arr,n);
//        int res = arr[0];
//        int arrSum = 0;
//        for(int i = 0; i < n; i++){
//            arrSum = arrSum + arr[i];
//           arr[i] = -arr[i];
//           int max_sum = arrSum + normalArray(arr,n);
//           res = Math.max(max_sum,normal);
//        }return res;
//    }
    //Next Approach;
    static int kadane(int []arr,int n){
        if(n == 1){
            return arr[0];
        }
        int max_sum = Integer.MIN_VALUE;
        int tempMax=0;
        int min_sum =Integer.MAX_VALUE;
        int tempMin=0;
        int arrSum=0;
        for(int i = 0;i<n;i++){
            tempMax +=arr[i];
            if(tempMax > max_sum){
                max_sum = tempMax;
            }
            if(tempMax < 0){
                tempMax = 0;
            }
            tempMin +=arr[i];
            if(tempMin < min_sum){
                min_sum = tempMin;
            }
            if(tempMin > 0){
                tempMin = 0;
            }
           arrSum +=arr[i];


        } if(arrSum == min_sum){
                return max_sum;}
            return  Math.max(max_sum,arrSum-min_sum);
    }
}
