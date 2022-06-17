package Searching;
public class FindPairInSortedArrayWhichGivesSumX {
    public static void main(String[] args) {
        int []arr={3,5,9,2,8,10,11};
        int n = arr.length;
        int x = 17;
        System.out.println(twoPointer(arr,n,x));
    }
    //Using Two pointers Approach. Time complexity O(log n) space complexity O(1)
    static boolean twoPointer(int []arr,int n,int x){
        int start = 0;
        int end = n-1;
        while(start < end){
            if(arr[start] + arr[end] == x){
                System.out.println(arr[start]+" "+arr[end]);
                return true;
            }
            else if((arr[start] + arr[end] )>x){
                end--;
            }
            else{
                start++;
            }
        }
        return false;
    }
}
