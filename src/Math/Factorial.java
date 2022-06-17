package Math;
import java.util.*;
public class Factorial{
   static Scanner sc=null;
    public static void main(String[] args){
        sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        calculateFactorial(n);
    }
    static void calculateFactorial(int number){
        int factorial=1;
        for(int i=2;i<=number;i++){
            factorial *=i;
        }
        System.out.println("The factorial of " + number + " is "+ factorial);
    }
}
