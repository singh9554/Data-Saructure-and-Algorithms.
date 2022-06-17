package Math;
import java.util.*;
public class Compute {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
       int res =1;
        //Time complexity is O(fn);
//       for(int i = 0 ; i < n ; i++) {
//           res = res * x;
//       }
//       System.out.println(res);
      // optimize code ;
        // Time complexity :- O(log n);
    while(n > 0) {
        if(n % 2 != 0) {
            res = res * x;
        }
        x = x * x;
        n = n / 2;
    }
System.out.println(res);
    }
}
