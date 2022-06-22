package Sorting_Algorithm;
public class UnionOfTwoSortedArrays {
    public static void main(String[] args){
        int []a={3,5,8};
//        int []a={2,10,20,20};
        int m = a.length;
        int []b={2,8,9,10,15};
//        int []b={3,20,40};
        int n = b.length;
        union(a,b,m,n);
    }
    //This is  The optimized solution of this problem using the MergeSort approach;
    //It's time complexity is O(m+n) and space complexity is O(1);
    static void union(int[]a,int[]b,int m , int n){
        int i = 0,j=0;
        while(i < m && j < n){
            if( i > 0 && a[i] == a[i-1]){
                i++;
                continue;
            }
            if(j > 0 && b[j] == b[j-1]){
                j++;
                continue;
            }
            if(a[i]<b[j]){
                System.out.print(a[i]+" ");
                i++;
            }
            else{
                System.out.print(b[j]+" ");
                j++;
            }
            if(a[i]==b[j]){
                    System.out.print(a[i]+" ");
                    i++;
                    j++;
                }
            }
        while(i < m){
            if(i> 0 && a[i] != a[i-1]) {
                System.out.print(a[i]+" ");
                i++;
            }
        }
        while(j < n){
            if( j > 0 && b[j] != b[j-1]) {
                System.out.print(b[j] + " ");
                j++;
            }
        }
    }
}
