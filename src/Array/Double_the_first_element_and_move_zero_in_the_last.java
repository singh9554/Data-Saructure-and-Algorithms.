package Array;
public class Double_the_first_element_and_move_zero_in_the_last {
    public static void array(int[]arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]!=0 && arr[i]==arr[i+1]){
                int temp=arr[i+1]*2;
                arr[i+1]=0;
                arr[i]=temp;
            }
        }
        System.out.println("\nAfter doubling the first element in the array: ");
        for(int e:arr){
            System.out.print(e+",");
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        for(int i=count;i<arr.length;i++){
            arr[i]=0;
        }
        System.out.println("\nAfter shifting all the Zero in the end:");
        for(int element:arr){
            System.out.print(element+",");
        }
    }
    public static void main(String[] args) {
        Double_the_first_element_and_move_zero_in_the_last obj=new Double_the_first_element_and_move_zero_in_the_last();
        int arr[]={2,2,0,4,0,8};
        int arr1[]={0,2,2,2,0,6,6,0,0,8};
        obj.array(arr);
        obj.array(arr1);
    }
}
