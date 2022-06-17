/* If any element occurs more than n/2 times (n = size of the array) is an array then
that element will be called as majority element in the array;
 */
package Array;
public class MajorityElement {
    public static void main(String[] args) {
//        int []arr = {8,3,4,8,8};
//        int []arr={20,30,40,50,50,50,50};
//        int [] arr = {3,7,4,7,7,5};
        int []arr = {8,7,6,8,6,6,6,6};
        int n = arr.length;
        System.out.println("Brute force approach : "+majority1(arr,n));
        System.out.println("Optimized approach : "+majority2(arr,n));
    }//This is a brute force approach which takes the Time complexity of O(N^2) and space complexity of O(1);
    static int majority1(int []arr,int n){
        int res = -1;
        int m = n/2;
        for(int i = 0 ; i < n; i++){
            int val = arr[i];
            int count = 1;
            for(int j = i + 1; j < n ;j++){
                if(val == arr[j]){
                    count++;
                }
            }
            if(count > m) {
                res = arr[i];
            }
        }
        return res;
    }
    //Optimized approach in by using Moore's voting algorithm;
    // which time complexity will be O(N) and space complexity will be O(1);
    static int majority2(int []arr,int n){
        int m = n/2;
        int res = arr[0];
        int count = 1;
        for(int i = 1 ; i < n; i++) {
            if(res == arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                res = arr[i];
                count = 1;
            }
        }
         count = 0;
        for(int i = 0 ; i < n ; i++){
            if(res == arr[i]){
                count++;
            }
        }
        if( count <= m){
            return -1;
        }
        return res;
    }
}
