package TwoPointer;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[]args){
int []arr={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
    int res = 1;
    for(int i = 1 ; i < nums.length ; i++){
        if(nums[res-1]!=nums[i]){
            nums[res]=nums[i];
            res++;
        }
    }
    return res;
    }
}
