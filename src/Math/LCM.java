package Math;
import java.util.*;
public class LCM {
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println(Lcm(a,b));
    }
    static int Lcm(int a, int b) {
//        int res = Math.max(a, b);
//        while( true ) {
//            if(res % a ==0 && res % b == 0){
//                break;
//            }
//            res++;
//        }
//        return res;
        //More efficient code is ;
        return (a * b / GcD(a,b));
    }
    static int GcD(int a , int b ){
        if(b==0){
            return a;
        }
        return GcD(b,a%b);
    }
}
