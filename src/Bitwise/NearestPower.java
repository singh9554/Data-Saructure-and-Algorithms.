package Bitwise;
import java.util.*;
public class NearestPower {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
    int x = sc.nextInt();
    NearestPower obj = new NearestPower();
        System.out.println(obj.power(x));
    }
    int power(int x ){
       x = x | x>>1;
       x = x | x>>2;
       x = x | x>>4;
       x = x | x>>8;
       x = x | x>>16;
       return ( x + 1) >> 1;
    }
}
