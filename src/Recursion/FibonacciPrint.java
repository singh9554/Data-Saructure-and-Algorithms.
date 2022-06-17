package Recursion;
import java.util.*;
public class FibonacciPrint {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        countAndPrint(n,"");
    }
    static int countAndPrint(int n,String out){
        if(n == 1 || n == 2){
            if(n == 1){
                System.out.println("0"+out);
                System.out.println("1"+out);
            }
            if(n == 2){
                System.out.println("00"+out);
                System.out.println("10"+out);
                System.out.println("01"+out);
            }
            return (n+1);
        }
        int choice_of_0=countAndPrint(n-1,out+"0");
        int choice_of_1=countAndPrint(n-2,out+"01");
        return choice_of_0+choice_of_1;
    }
}
