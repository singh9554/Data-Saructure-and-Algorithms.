// Stock Buy And Sell Problem;
package Array;
import java.util.*;
public class StockBuyAndSell {
    public static void main(String[] args) {
//        int []arr={1,5,3,1,2,8};
        int []arr={1,5,3,8,12};
//        int []arr={30,20,10};
//        int []arr={10,20,30};
        System.out.println(profit(arr,0,arr.length-1));
    }//Naive Approach;
    //Time complexity of This solution in O(N^2) and space complexity if O(1);
    static int profit(int []arr,int start , int end){
      if(end <= start){
          return 0;
      }
      int profit = 0;
      for(int i = start; i < end ; i++){
          for(int j = i + 1;j <= end;j++){
              if(arr[j] > arr[i]){
                  int curr_profit = arr[j] - arr[i]+profit(arr,start,i-1)+profit(arr,j+1,end);
                  profit =Math.max(profit,curr_profit);
              }
          }
      } return profit;
    }
}
