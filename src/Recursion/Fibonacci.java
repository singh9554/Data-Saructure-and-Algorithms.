package Recursion;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fib(n));
    }
    static int Fib(int n){
        if(n==1 || n==2) return (n+1);//Base case;
        //Assumption;
        int choice_of_0 = Fib(n-1);
        int choice_of_1 = Fib(n-2);
        return choice_of_0+choice_of_1;//Self Work;
    }
}
