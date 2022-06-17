/*This is a popular interview Question by Google Allocate Minimum NUmber of pages*/
package Searching;
public class AllocateMinimumPages {
    public static void main(String[]args){
        int []arr={10,20,30,5,50};
        int n = arr.length;
        int k = 2;
        System.out.println(minimumPages(arr,n,k));
    }
    static boolean isFisible(int []arr,int n , int k ,int ans){
        int student = 1,sum = 0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i] > ans){
                student++;
                sum = arr[i];
            }
            else{
                sum +=arr[i];
            }
        }
        return student<=k;
    }
    static int minimumPages(int []arr,int n,int k){
        int Min=0, sum=0;
        for(int i = 0;i<n;i++){
             sum+=arr[i];
            Min = Math.max(Min,arr[i]);
        }
        int low = Min, high = sum,ans=0;
        while(low<=high){
            int mid = (low+high)/2;
            if(isFisible(arr,n,k,mid)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
