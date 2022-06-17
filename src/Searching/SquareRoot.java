package Searching;
public class SquareRoot {
    public static void main(String[] args) {
//        System.out.println(square(16));
        System.out.println(squareOp(4));
    }
    //Brute Force solution TimeComplexity O(root x) S.C: O(1)
//    static int square(int x){
//        int i = 1;
//        while(i * i <= x){
//            i++;
//        }
//        return (i-1);
//    }
    // Optimize Solution by binary Search TimeComplexity O(log n) and space complexity O(1);
    static int squareOp(int x){
        int low = 1;
        int high = x;
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            int midSqt  = mid * mid;
            if(midSqt == x){
                return mid;
            }
            else if(midSqt > x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}
