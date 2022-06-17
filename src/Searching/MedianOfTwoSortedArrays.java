package Searching;
import java.util.*;
public class MedianOfTwoSortedArrays {
    public static void main(String[]args){
        int []arr1={1,2,3,4,5,6};
        int size1 = arr1.length;
        int []arr2={40,30,10,50,20};
        int size2 = arr2.length;
        System.out.println(NaiveApproach(arr1,arr2,size1,size2));
    }
    static double NaiveApproach(int []arr1,int []arr2,int size1,int size2){
        int []temp=new int[size1+size2];
        int index=0;
      for(int i = 0;i<size1;i++){
          temp[index++]=arr1[i];
      }
        for(int i = 0;i<size2;i++){
            temp[index++]=arr2[i];
        }
        Arrays.sort(temp);
        int low = 0;
        int high = temp.length - 1;
        int mid = (low+high)/2;
        if((size1+size2)%2==0){
            double an=(temp[mid]+temp[mid+1])/2;
            return an;
        }
        else{
            return temp[mid];
        }
    }
}
