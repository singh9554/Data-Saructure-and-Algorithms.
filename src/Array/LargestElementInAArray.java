package Array;
public class LargestElementInAArray {
    public static void main(String[] args) {
//        int []arr={10,5,20,8};
        int [] arr = {40,8,50,100};
        int n = arr.length;
        System.out.println("BruteForce Approach "+LargestBruteforce(arr,n));
        System.out.println("First method ans "+Largest(arr,n));
        System.out.println("2nd method ans "+largest1(arr,n));
    }
    //Nive approach.
    static int LargestBruteforce(int[]arr,int n){
        for(int i = 0;i < n ; i++){
            boolean flag = true;
            for(int j = 0; j < n; j++){
                if(arr[j]>arr[i]){
                    flag= false;
                    break;
                }
            }
            if(flag){
                return i;
            }
        }
        return -1;
    }
    //Optimize approach part 1;
    static int Largest(int []arr,int n){
        int ans = 0;
        int Max = 0;
        int i = 0;
        while(i < n){
            int a = arr[i];
            if(a > Max){
                Max = a;
                ans = i;
            }
            i++;
        }
        return ans;
    }
    //Optimize approach part 2;
    static int largest1(int []arr,int n){
        int res = 0;
        for(int i = 1 ; i < n ; i++){
            if(arr[i]>arr[res]){
                res = i;
            }
        }
        return res;
    }
}
