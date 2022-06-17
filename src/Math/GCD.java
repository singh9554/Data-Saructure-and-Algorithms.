package Math;
import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
//        int GCD = Math.min(a,b);
        // Basic solution;
//        while(GCD > 0) {
//            if(a % GCD == 0 && b % GCD == 0) {
//                break;
//            }
//            GCD--;
//        }
        //Solution using euclid algorithm;
//        while(a!=b){
//            if(a > b){
//                a = a - b;
//            }
//            else {
//                b = b - a;
//            }
//        }
        //Optimal solution using Euclid algorithm;
        System.out.println(Gcd(a,b));
    }
    static int Gcd(int a, int b){
        if (b==0){
            return a;
        }
        else {
            return Gcd(b, a%b);
        }
    }
}
