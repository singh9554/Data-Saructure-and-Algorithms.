//Sieve Erotosthenes Algorithms;
package Math;
import java.util.*;
public class Sieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      boolean []isPrime = new boolean [n];
      Arrays.fill(isPrime,true);
//      for(int i = 2 ; i * i < n ; i++){
//         if(isPrime[i]) {
//             for(int j = i * i; j < n ; j = j + i) {
//                 isPrime[j]=false;
//             }
//         }
//      }
//      for(int i = 2 ; i < n ; i++) {
//          if(isPrime[i]){
//              System.out.print(i+ " ");
//          }
//      }
        //Below code run with same time complexity as compare,
        //to upper code but the code length is shorter;
        for(int i = 2; i < n; i++){
            if(isPrime[i]){
                System.out.print(i+" ");
                for(int j = i * i ; j < n ; j = j + i) {
                    isPrime[j]=false;
                }
            }
        }
        //The time complexity of the following code is O(n loglog n);
    }
}
