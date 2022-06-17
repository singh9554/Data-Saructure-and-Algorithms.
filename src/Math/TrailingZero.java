package Math;
import java.util.*;
public class TrailingZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n;
        long fact = 1;
        while(i != 0){
            fact = fact * i;
            i--;
        }
        System.out.println(fact);
        int count =0;
        while(fact % 10 == 0) {
                count++;
            fact = fact / 10;
        }
            System.out.println("The number of Trailing Zero in factorial of " +n+ " is " +count);
//Time complexity of this function is O(n);
        //This program will cause overflow for bigger value so we need to do it in more efficient way;
}
}
