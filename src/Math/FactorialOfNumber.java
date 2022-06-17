package Math;
import java.util.*;
public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
     while(n!=0) {
        factorial = factorial * n;
        n--;
    }
        System.out.println("The factorial of the given number is "+ factorial);
    }
}
