package Bitwise;
import java.util.*;
public class FirstBit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        for(int i = 0; i <= a * 8; i++){
            if(((a>>i)&1) ==1){
                count ++;
                break;
            }
         count++;

        }
        System.out.println(count);
    }
}
