//Stock Buy And Sell Optimize Approach;
package Array;

import java.util.Arrays;

public class StockBuyAndSell2 {
public static void main(String[]args){
//int []arr ={1,5,3,8,12};
//        int []arr={30,20,10};
        int []arr={10,20,30};
//            int []arr={1,5,3,1,2,8};
int n = arr.length;
    System.out.println(profit(arr,n));
}
static int profit(int []arr,int n){
    int profit = 0;
   for(int i = 1; i < n ; i++){
       if(arr[i] > arr[i-1]){
           profit += arr[i] - arr[i -1];
       }
   } return profit;
}

}
