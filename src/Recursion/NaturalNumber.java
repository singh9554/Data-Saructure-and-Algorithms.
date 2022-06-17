//N natural number;
package Recursion;
import java.util.*;
public class NaturalNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        Number(n);
    }
    static void Number(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);// Before going into the recursion;
        Number(n-1);
        System.out.println(n);// After coming from recursion;
    }
}
