package Array;
public class MaximumConsecutiveOne {
     public static void main(String[]args){
//          int []arr={1,0,1,1,1,1,0,1,1};
//                    int []arr={0,0,0,0};
//            int []arr={1,1,1,1};
          int []arr={0,1,1,0,1,0};
          int n = arr.length;
          System.out.println("Naive approach answer "+maximum1(arr,n));
          System.out.println("Optimized approach answer "+maximum2(arr,n));
     }
     //This is a Naive solution which takes time complexity of O(N^2) and space complexity of O(1);
     static int maximum1(int []arr,int n){
          int res = 0;

          for(int i = 0 ; i < n;i++){
               int count = 0;
               for(int j = i ; j < n ;j++ ){
                    if(arr[j] == 1){
                         count++;
                    }
                    else {
                         break;
                    }
               }
               res = Math.max(res,count);
          }
          return res;
     }
     //This is optimized solution which takes time complexity of O(n) and space complexity of O(1);
     static int maximum2(int []arr,int n){
          int one = 1;
          int count = 0;
          int res = 0;
          for(int i = 0;i < n ;i++){
               if(arr[i] == one){
                    count++;
                    res = Math.max(res,count);
               }
               else if(arr[i] != one){
                    count = 0;
               }
          }
          return res;
     }
}
