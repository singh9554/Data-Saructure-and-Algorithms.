package Math;
import java.util.*;
public class DigitFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
        long res = 1;
        for(int i = N ; i > 1; i--) {
            res = res * i;
        }
        long count = 0;
        while(res > 0) {
            count++;
            res = res / 10;
        }
        System.out.println(count);
    }
}
