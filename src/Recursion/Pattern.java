package Recursion;
import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        triangle(5,0);
        System.out.println();
        triangle2(5,0);
    }
    static void triangle(int r, int c) {
        if (r == 0) return;
        if (c < r) {
            triangle(r, c + 1);
            System.out.print("*" + " ");
        } else {
            triangle(r - 1, 0);
            System.out.println();
        }
    }
     static void triangle2(int r,int c){

         if ( r == 0) return;
         if( c < r){
             System.out.print("*" +" ");
             triangle2(r,c+1);
         }
         else{
             System.out.println();
             triangle2(r-1,0);
         }
        }


}
