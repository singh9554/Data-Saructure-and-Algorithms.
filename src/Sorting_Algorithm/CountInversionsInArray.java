package Sorting_Algorithm;
public class CountInversionsInArray {
    public static void main(String[]args){
        int []arr={2,4,1,3,5};
//        int []arr={10,20,30,40};
//        int []arr={40,30,20,10};
        int n = arr.length;
//        System.out.println(countInversion(arr,n));
        System.out.print(sort(arr,0,n-1));
    }
    //This is a naive approach which time complexity is O(n^2).space complexity is O(1)
    static int countInversion(int[]arr,int n){
        int count =0;
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(i < j && arr[i] > arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    //---------------------------------------------------------------------------------------------------
    //This is a efficient approach Using MergeSort technique , which has  the time complexity of O(n(log n)
    //and space complexity of O(1).
    static int sort(int[]arr,int l , int r){
        int res=0;
        if(l < r){
            int m = l+(r-l)/2;

            res += sort(arr, l, m);
            res +=sort(arr, m + 1, r);
            res +=  mergeSort(arr, l, m , r);
        }
        return res;
    }
    static int mergeSort(int []arr,int l,int m ,int r){
        int n1=m-l+1, n2=r-m;
        int[] left=new int[n1];int[] right=new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[i+l];
        for(int j=0;j<n2;j++)
            right[j]=arr[m+1+j];
        int res=0,i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j])
            {arr[k++]=left[i++];}
            else{
                arr[k++]=right[j++];
                res=res+(n1-i);
            }
        }
        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++];
        return res;
    }
}
