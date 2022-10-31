package Searching;
import java.util.*;
public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String []args){
//  int []nums = {1,2,3,6,6,8,9};
        int []nums={};
  int target = 0;
       searchRange(nums,target);
    }
    public static void searchRange(int[] nums, int target) {
        int []arr=new int [2];
        int i = firstSearch(nums,target,0,nums.length-1);
        int j = lastSearch(nums,target,0,nums.length-1);
        arr[0]=i;
        arr[1]=j;
        System.out.println( Arrays.toString(arr));

    }
static int firstSearch(int []nums,int target,int start,int end){
int position = -1;
while(start<=end){
    int mid = (start+end)/2;
    if(nums[mid]==target){
        position = mid;
    }
    if(nums[mid]>=target){
        end = mid -1;
    }
    else{
        start = mid+1;
    }
}
return position;
}
static int lastSearch(int []nums,int target,int start,int end) {
    int position = -1;
    while (start <= end) {
        int mid = (start + end) / 2;
        if (nums[mid] == target) {
            position = mid;
        }
        if (nums[mid] <= target) {
            start = mid + 1;
        } else {
            end = mid -1;
        }
    }
    return position;
}
}
