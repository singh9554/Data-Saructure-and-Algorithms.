package Array;
import java.util.*;
public class Rotate_an_array {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int size=7;
        int pos=3;
        int []arr=new int[size];
        System.out.println("Enter the element in the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("\nThe Main Array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        int index= 0;
        int []temp = new int[arr.length];
        for(int i=pos;i<arr.length;i++){
            temp[index] = arr[i];
            index++;
        }
        int []temp2=new int[pos];
        for(int i=0;i<pos;i++){
            temp[index]=arr[i];
            index++;
        }

        for(int i=0;i<arr.length;i++){
           arr[i]=temp[i];

        }System.out.println("\nprint the Rotated Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
