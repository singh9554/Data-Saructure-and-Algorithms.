/* Minimum Consecutive Flips
Here we have to find the frm index to index ( for eg: 0 to 4) to flip the bit to
make all the element same in the array;
 */
package Array;
public class MinimumConsecutiveFlips {
    public static void main(String[] args) {
//        int []arr = {1,0,1,0,0,1,0,0,0};
        int []arr={0,0,1,1,0,0,1,1,0};
        int n = arr.length;
        flip(arr,n);
    }
    static void flip(int []arr,int n) {
        for(int i = 1; i < n ;i++) {
            if(arr[i] != arr[i-1]){
                if(arr[i] != arr[0]){
                    System.out.print(i+" ");
                }
                else {
                    System.out.println(i - 1+" ");
                }

            }
        }
        if(arr[n - 1] != arr[0]){
            System.out.println(n - 1+" ");
        }
    }
}
