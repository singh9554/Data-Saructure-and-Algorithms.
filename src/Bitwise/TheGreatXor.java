package Bitwise;
import java.util.*;
public class TheGreatXor {
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int q = sc.nextInt();
while(q > 0){
    long x = sc.nextInt();
    long count = 0;
    int j = 0;
    while( x > 0) {
        if ((x & 1) == 0) {
            count +=Math.pow(2,j);
        } x >>=1;
        j +=1;
    }
    System.out.println(count);
    q--;
}

    }
}
