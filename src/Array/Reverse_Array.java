package Array;

public class Reverse_Array {
    public void reverse(int arr[], int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high-1];
            arr[high-1] = temp;
            low++;
            high--;
        }
    }
    public static void print(int arr[]){

        for( int element:arr){
            System.out.print(element + ",");
        }
    }
    public static void main(String[]args){
        int []arr={1,2,3,4,5,6,9};
        int low=0;
        int high=arr.length;
        Reverse_Array object = new Reverse_Array();
        System.out.println("\nprint the main array");
        object.print(arr);
        object.reverse(arr,low,high);
        System.out.println("\nprint the reverse array");
        object.print(arr);
    }
}



