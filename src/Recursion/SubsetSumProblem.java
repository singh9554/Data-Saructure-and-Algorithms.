package Recursion;
public class SubsetSumProblem {
    public static void main(String[] args) {
        int []arr={10,20,15};
        int n = arr.length;
        int sum = 15;
        System.out.println(Subset(arr,n,sum));
    }

    static int Subset(int[] arr, int n, int sum) {
        if (n == 0) {

            return (sum == 0) ? 1 : 0;
        }
        return Subset(arr, n - 1, sum) + Subset(arr, n - 1, sum - arr[n - 1]);
    }
}
