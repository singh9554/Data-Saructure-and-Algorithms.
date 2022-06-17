package Array;

public class LimakAndContest {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int n = arr.length;
        int k = 2;
        contest(arr,n,k);
    }
    static void contest(int []arr,int n,int k){
        for(int i = 0;i<n-k+1;i++){
            int max = Integer.MIN_VALUE;
            int count =0;
            int CountOf1=0;
            int countOf2=0;
            for(int j = 0;j<k;j++){
                int a = arr[i+j];
               while(a > 0){
                   count++;
                   a = a&(a-1);
               }
            if(j < k-1){
                CountOf1++;
                count=0;
               }
            if(j == k-1){
                countOf2++;
            }
             if(CountOf1 < countOf2){
                System.out.println(arr[i+j]);
            }
            else if(CountOf1 == countOf2){
                System.out.print(arr[i+j]);
            }
            }

        }

    }
}
