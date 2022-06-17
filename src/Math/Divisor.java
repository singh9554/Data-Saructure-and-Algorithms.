
package Math;
import java.util.*;
public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int i = 1;
        // Brute force approach;
//        while(i <= n){
//            if(n % i == 0) {
//                System.out.print(i +" r");
//            }
//            i++;
//        }
        //Optimize approach; but not print in sorted order;
//        while( i * i <= n){
//            if( n % i == 0) {
//                System.out.print(i);
//                if(i != n/i) {
//                    System.out.print(" "+n/i+" ");
//                }
//            }
//            i++;
//        }
        //Optimize approach with sorted approach;
        for( ; i * i <= n ; i++) {
            if(n % i == 0) {
                System.out.print(i+" ");
               
            }
            }for( ; i >= 1; i--) {
                if(n % i == 0) {
                    System.out.print(n / i+" ");
                }
        }

    }
}
