package Array;
public class N_Bonacci {
    public static void main(String[] args) {
    int m = 8;
    int N = 3;
    int [] arr = new int [m];
    nBonacci(arr,N,m);
    }
    static void nBonacci(int []arr,int N,int m) {
        for (int i = 0; i < N; i++) {
            if (i == N - 1) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        int k = N;
        for (int i = 0; i < m - N ; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += arr[i + j];
            }
            arr[k++] = sum;
        }
        print(arr);
    }
static void print(int []arr){
           for(int e : arr){
               System.out.print(e+"  ");
           }
        }
    }

