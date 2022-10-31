package TwoPointer;
import java.util.*;
public class ThreeSum {
    public static void main(String[] args) {
int []arr={-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
List<List<Integer>> result = new ArrayList<List<Integer>>();
int n = nums.length;
for(int i = 0; i < n-2; i++){
    if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
int low = i + 1; int high = n -1; int sum = 0 - nums[i];
while(low < high){
    if(nums[low] + nums[high] == sum){
        result.add(Arrays.asList(nums[low],nums[high],nums[i]));
        while(low < high && nums[low] == nums[low+1]){
            low++;
        }
        while(low < high && nums[high] == nums[high-1]){
            high--;
        }
        low++;
        high--;
    }
    else if(nums[low] + nums[high] < sum){
        low++;
    }
    else{
        high--;
    }
}
    }
}
return result;
    }
}
