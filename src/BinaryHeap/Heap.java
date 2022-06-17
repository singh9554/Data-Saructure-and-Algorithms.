package BinaryHeap;
public class Heap{
    static void heapify(int[]arr,int n,int i){
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
    // Function to build a Max-Heap from the Array
    static void BuildHeap(int[]arr,int n){

        // Index of last non-leaf node
        int startIdx = (n / 2) - 1;

        // Perform reverse level order traversal
        // from last non-leaf node and heapify
        // each node
        for (int i = startIdx; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }
    static void print(int[]arr){
        System.out.println("Print Heap");
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
    public static void main(String[]args){
        int n=6;
        System.out.println("Size of the arr is "+n);
        int []arr={40,10,30,50,60,15};
        heapify(arr,n,2);
        BuildHeap(arr,n);
        print(arr);
    }
}