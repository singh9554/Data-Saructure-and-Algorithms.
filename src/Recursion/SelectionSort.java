package Recursion;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1,8,9,6};
        selection_sort(arr, arr.length, 0);
    }

    static int minIndex(int[] arr, int i, int n) {
        if (i == n) return i;//base case;
        // Find minimum of remaining elements
        int k = minIndex(arr, i + 1, n);
        // Return minimum of current and remaining.
        return (arr[i] < arr[k]) ? i : k;
    }

    static void selection_sort(int[] arr, int n, int index) {
        if (index == n) return; //base case;
        // calling minimum index function for minimum index
        int k = minIndex(arr, index, n - 1);
        // Swapping when index nd minimum index are not same
        if (k != index) {
            int temp = arr[k];
            arr[k] = arr[index];
            arr[index] = temp;
        }print(arr);
        System.out.println();
        // Recursively calling selection sort function
        selection_sort(arr, n, index + 1);
    }

    static void print(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}
