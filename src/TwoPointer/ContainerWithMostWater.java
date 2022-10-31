package TwoPointer;
public class ContainerWithMostWater {
    public static void main(String[]args){
    int []height ={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int n = height.length-1;
        int start = 0;
        int end = n;
        int Max =0;
        while(start < end){
            int Min = Math.min(height[start],height[end]);
            Max = Math.max(Max,(Min * (end-start)));
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return Max;
    }
}
