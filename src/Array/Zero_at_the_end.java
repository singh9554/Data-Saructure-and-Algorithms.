package Array;

public class Zero_at_the_end {
    public static void main(String[]args) {
       int arr[]={1,2,3,0,4,0,5,0};
               int count=0;
       for(int i=0;i<arr.length;i++) {
           if(arr[i]!=0){
               arr[count++]=arr[i];
           }
       }
       for(int i=count;i<arr.length;i++) {
           arr[i]=0;
       }
       for(int element:arr){
           System.out.print(element+" ");
       }
    }
}
