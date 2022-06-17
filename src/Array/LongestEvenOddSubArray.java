package Array;
public class LongestEvenOddSubArray {
    public static void main(String[]args){
//          int []arr={10,12,14,7,8};
//        int [] arr = {7,10,13,14};
        int []arr={1,3};
//        int []arr={10,12,8,4};
        int n = arr.length;
        System.out.println(evenOdd1(arr,n));
        System.out.println(evenOdd2(arr,n));
    }
    static int evenOdd1(int []arr,int n){
        int res = 1;
        for(int i = 0;i < n ;i++){
            int count = 1;
            for(int j = i ; j < n - 1; j++){
                if(((arr[j] % 2)== 0 && (arr[j + 1] % 2) != 0) || (arr[j] % 2)!= 0 && (arr[j + 1] % 2) == 0){
                    count++;
                }
                else{
                    break;
                }

            }
          res = Math.max(res,count);
        }
       return res;
    }
    static int evenOdd2(int []arr,int n){
        int count =1;
        int res = 1;
        for(int i = 1;i < n; i++){
            if(((arr[i] % 2) == 0 && (arr[i - 1] % 2) == 0 || (arr[i] % 2) != 0 && (arr[i - 1] % 2 ) != 0)){
                count = 1;
            }
            else{
                count++;
                res = Math.max(res,count);
            }
        }
        return res;
    }
}
