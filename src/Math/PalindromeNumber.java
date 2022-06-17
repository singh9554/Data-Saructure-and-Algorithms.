package Math;
import java.util.*;
public class PalindromeNumber {
public static void main(String[] args) {
 Scanner sc = new Scanner (System.in);
 int n = sc.nextInt();
 int i = n;
 int rev = 0;
 while(i > 0) {
     int a = i % 10;
     rev = rev * 10 + a;
     i = i / 10;
 }
    if(n==rev) {
        System.out.println("It is a palindrome number");
    }
    else {
        System.out.println("It is not a palindrome number");
    }
    //Time complexity of this program is O(d);
}
}