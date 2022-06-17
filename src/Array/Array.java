//What is array?
//== An array is a data Structure that store similar elements in a contiguous memory location;
package Array;
import java.util.*;
public class Array {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array ");
    int n=sc.nextInt();
    int []arr=new int[n];
    System.out.println("Initializing the array: ");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Printing an array ");
    for(int element:arr){
        System.out.print("["+element+"]");
    }
}
}
