package Recursion;
public class Sorting {
    public static void main(String[] args){
int n = 5;
int [] arr = {5,2,4,7,1};
//int [] arr = {1,2,3,4,5};
        System.out.println(Sort(arr,0,n));
    }
    static boolean Sort(int [] arr,int i, int n){

        if(n == 0 || n == 1){
            return true;
        }
        return Sort(arr, i + 1, n - 1) && arr[i] <= arr[i + 1];
    }
}
