package Math;
import java.util.*;
public class ArmNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner( System.in);
       System.out.println("Enter the number");
       int n = sc.nextInt();
       int i = n;
       int count = 0;
       while(i != 0) {
           count++;
           i = i / 10;
       }
       System.out.println(count);
       int sum = 0;
       int j = n;
       while(j != 0) {
           int a = j % 10;
           double b = (int) Math.pow(a,count);
           sum += b;
           j = j / 10;
       }
        System.out.println(sum);
       if(sum == n){
           System.out.println("The number is a armStrong number");
       }
       else{
           System.out.println("The number is not a armStrong number");
       }
    }
}


