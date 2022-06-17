package Sorting_Algorithm;
import java.util.*;
public class Quick_sort {
    int size;
   static int []arr;
   private Quick_sort(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Initialize the size of the array");
        size = scan.nextInt();
       arr=new int[size];
        System.out.println("Enter the element in the array: ");
        for(int i = 0; i < size; i++){
            arr[i] = scan.nextInt();
    }
   }
        public static void Display_items(int arr[]){
            for(int element:arr){
                System.out.print(element+",");
            }
            System.out.println("");

}
            public void swap(int loc1,int loc2){
                int temp=arr[loc1];
               arr [loc1]=arr[loc2];
                arr[loc2]=temp;
            }
public int partition(int low,int high){
       int pi=arr[high];

       int i=low-1;
       for(int j=low;j<=high-1;j++){
           if(arr[j]<pi){
               i++;
               swap(i,j);
           }
       }
           swap(i+1,high);
           return i+1;
   }
   public void Sorting(int low,int high){
       if(low<high){
           int pi=partition(low,high);
            Display_items(arr);
            Sorting(low,pi-1);
            Sorting(pi+1,high);
       }
   }

    public static void main(String[] args) {
        Quick_sort obj=new Quick_sort();
        System.out.println("Display the unsorted array:");
        Display_items( arr);
        obj.Sorting(0,arr.length-1);
        System.out.println("\nDisplay the sorted array: ");
        Display_items(arr);

    }
}
