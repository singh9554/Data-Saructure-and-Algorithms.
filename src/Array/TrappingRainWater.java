package Array;
public class TrappingRainWater {
    public static void main(String[] args) {
//        int [] arr= {4,1,0,2,3,0,5};
        int []arr={0,1,0,2,1,0,1,3,2,1,2,1};
int n = arr.length;
        System.out.println("Answer from 1st approach " +trapping1(arr,n));
        System.out.println("Answer from 2nd approach " +trapping2(arr,n));
    }
    //This approach takes O(N^2) time complexity and O(1) Auxiliary Space Complexity;
    static int trapping1(int []arr,int n){
        int res = 0;
        for(int i = 1; i < n ;i++){
            int lmax=arr[i];
            for(int j = 0;j < i ; j++){
                lmax = Math.max(lmax, arr[j]);
            }
            int rmax = arr[i];
            for (int j = i + 1; j < n;j++){
                rmax = Math.max(arr[j],rmax);
            }
            res += Math.min(lmax,rmax) - arr[i];
        }
        return res;
    }
    //This Solution Takes Time complexity of O(n) and Auxiliary Space complexity of O(n);
    static int trapping2(int []arr,int n){
        int res = 0;
        int []left = new int [n];
        int []right = new int [n];
        left[0]=arr[0];
        for(int i = 1;i < n;i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }
        right[n-1]=arr[n-1];
        for(int i = n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
        for(int i = 0;i<n;i++){
            res +=Math.min(left[i],right[i]) - arr[i];
        }
        return res;
    }
}
