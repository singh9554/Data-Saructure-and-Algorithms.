package Array;
public class LongestSubArray {
    public static void main(String[] args) {
//                int []A={4,1,1,1,2,3,5};
//        int []A={-7,-11,-3,-7,4,15,-13,18,-10,-10};
        int []A={-13 ,0 ,6 ,15, 16 ,2, 15, -12 ,17, -16, 0, -3, 19 ,-3 ,2 ,-9, -6};
        int N = A.length;
//        int K = 5;
//        int K = 23;
        int K = 15;
        int i = 0;
        int j = 0;
       long sum = 0;
        int Max = Integer.MIN_VALUE;
//        int a = Integer.MIN_VALUE;
        while( j < N){
            sum = sum + A[j];
//            if(sum<0){
//                continue;


//            }
            if(sum == K){
                Max = Math.max(Max,j-i+1);

            }
            if(sum>K){
                while(sum>K){
                    sum -=A[i];
                    i++;

                }
                 }j++;
            }
      if(Max < 0 ){
          Max = 0;
      }
        System.out.println(Max);
        }

    }

//17 15
//        -13 ,0 ,6 ,15, 16 ,2, 15, -12 ,17, -16, 0, -3, 19 ,-3 ,2 ,-9, -6