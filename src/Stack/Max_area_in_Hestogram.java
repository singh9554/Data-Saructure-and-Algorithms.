//BRUTFORCE APPROACH.
package Stack;
public class Max_area_in_Hestogram {
    public static void main(String[]args){
        int []arr={4,2,1,5,6,3,2,4,2};
        int area = 0;
        for(int i=0;i<arr.length;i++){
            int left=i;
            int right=i;
            while(arr[left]>=arr[i]){
                left--;
            }
            while(arr[right]>=arr[i]){
                right++;
            }
           area =(right-left-1)*arr[i]; 
        }
        System.out.println(area);
    }

}
