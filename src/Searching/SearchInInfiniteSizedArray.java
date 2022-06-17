package Searching;
public class SearchInInfiniteSizedArray {
    public static void main(String[] args) {
        //for Ex I m taking small size array, but in general it is an infinite solution array;
        int []arr={10,20,30,40,50,60,70};
//        int []arr={10,20,30,40,60,70};//This test case will fail because it is not an infinite array;
        int x = 50;
//        System.out.println(searchInfinite(arr,x));
        System.out.println(searchOp(arr,x));
    }
    //BruteForce Solution TimeComplexity O(pos),
//    static int searchInfinite(int []arr,int x){
//        int i = 0;
//        while(true){
//            if(arr[i] == x){
//                return i;
//            }
//            else if(arr[i] > x){
//               return -1;
//            }
//            i++;
//        }
//
//    }
    //Method of Binary Search;
    static int binarySearch(int[]arr,int x,int low,int high ){
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid] == x){
            return mid;
        }
        else if(arr[mid] < x){
            return binarySearch(arr,mid+1,high,x);
        }
        else{
            return binarySearch(arr,low,mid-1,x);
        }
    }
    //Optimized solution by using Binary search
    static int searchOp(int []arr,int x){
        if(arr[0]==x){
            return 0;
        }
        int i = 1;
        while(arr[i] < x){
           i = i*2;
        }
        if(arr[i] == x){
            return i;
        }
        return binarySearch(arr,x,(i/2)+1,i-1);
    }
}
