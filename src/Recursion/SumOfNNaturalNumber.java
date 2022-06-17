package Recursion;
import java.util.*;
public class SumOfNNaturalNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Natural(n));
    }
    static int Natural(int n){
        if(n==1){
            return 1;//Base Case;
        }
      return n*Natural((n+1)/2) ;//Assumption;
    }
}
