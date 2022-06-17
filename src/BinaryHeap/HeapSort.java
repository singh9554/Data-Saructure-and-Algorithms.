package BinaryHeap;

public class HeapSort {
    static void sort(int arr[])
    {
        int n = arr.length;
        // One by one extract an element from heap
        for (int i = n-1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
    static void heapify(int[]arr,int n,int i){
      int largest=i;
      int l=2*i; // left=2*i;
      int r=2*i+1; //right=2*i+1;
        if(l<n && arr[l]>arr[largest]){
            largest=l;
        }
      else if(r<n && arr[r]>arr[largest]){
          largest=r;
      }
      if(largest!=i){
        int swap=arr[i];
        arr[i]=arr[largest];
        arr[largest]=swap;
        heapify(arr,n,largest);
      }
    }
    static void buildHeap(int[]arr,int n){
        int str=(n/2)-1;
        for(int i=str;i>=0;i--){
            heapify(arr,n,i);
        }
    }
    static void print(int []arr){
        System.out.println("Print Heap:");
        for(int element:arr){
            System.out.print(element+" ");
        }
    }

    static void prinT(int []arr){
        System.out.println();
        System.out.println("Print the sorted Heap:");
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
    public static void main(String[]args){
        int n=6;
        System.out.println("Size of the array: "+n);
        int []arr={40,10,30,50,60,15};
        heapify(arr,n,2);
        buildHeap(arr,n);
        print(arr);
        sort(arr);
        prinT(arr);
    }
}
