package Array;
public class FrequenciesofLimitedRangeArrayElements {
    public static void main(String[]args){
int []arr = {2, 3, 2, 3, 5};
//        int []arr = {3,3,3,3};
int N = arr.length;
int P = 5;
frequency(arr,N,P);
    }
    static void frequency(int arr[], int N, int P){
        for(int i = 1 ; i <= P ; i++){
            int count = 0;
            for(int j = 0 ;j < N ;j++){
                if(arr[j] == i){
                    count++;
                }
            }
            System.out.print(count+" ");
        }
    }
}
