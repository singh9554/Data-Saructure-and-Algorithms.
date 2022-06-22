/*  This is a leetCode 1287no Problem;
1287. Element Appearing More Than 25% In Sorted Array
Add to List
Share
Given an integer array sorted in non-decreasing order,
 there is exactly one integer in the array that occurs more than 25% of the time,
  return that integer.
Example 1:
Input: arr = [1,2,2,6,6,6,6,7,10]
Output: 6
Example 2:
Input: arr = [1,1]
Output: 1
Constraints:
1 <= arr.length <= 104
0 <= arr[i] <= 105*/
package Array;
public class ElementAppearingMoreThan {
    public static void main(String[]args){
      int []arr={1,2,2,6,6,6,6,7,10};
      int n = arr.length;
        System.out.println(findSpecialInteger(arr,n));
    }
    static int findSpecialInteger(int[] arr,int n) {
        double limit =(int)arr.length * 0.25;
        int res = arr[0];
        int count = 1;
        for(int i = 1;i < n ;i++){
            if(arr[i] ==  res){
                count++;
            }
            else{
                count = 1;
                res = arr[i];
            }
            if(count > limit){
                return res;
            }
        }
        return res;
    }
}
