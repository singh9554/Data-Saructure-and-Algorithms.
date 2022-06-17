//<<<<<<<<<<<<<<<<<<<----------------------------Game of deletion--------------------->>>>>>>>>>>>>>>>>>>>>>>>
package Bitwise;
import java.util.*;
public class GameOfDeletion {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int [] A = new int[size];
        int [] B = new int[size];
        System.out.println("Initialize the array A : ");
        for(int i = 0 ; i < size ; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Initialize the array B : ");
        for(int i = 0 ; i < size ; i++) {
            B[i] = sc.nextInt();
        }
        int S1=0,S2=0,C1=0,C2=0;
        for(int i = 0 ; i < size ; i++) {
            S1 += A[i];
            C1 = C1 | A[i];
        }
        int r1 = S1 - C1;
        for(int i = 0 ; i < size ; i++) {
            S2 += B[i];
            C2 = C1 | B[i];
        }
        int r2 = S2 - C2;
        if(r1 > r2){
            System.out.println("Player 1 : "+ (r1 - r2));
        }
        else if(r2 > r1) {
            System.out.println("Player 2 : "+(r2 - r1));
        }
        else {
            System.out.println("-1");
        }

    }
}
