/*
This is a solution of the problem , check K-th bit is set or not
 */
package Bitwise;
public class CheckIfKIsSetBitOrNot {
    public static void main(String[]args){
    int n=5;
    int k =3;
    bit1(n,k);
    bit2(n,k);
    }
    //by left shift >> approach;
    static void bit1(int n ,int k){
        int a = n&(1<<(k-1));
      if(a!=0){
          System.out.println("yes");
      }
      else{
          System.out.println("no");
}
}
//by right shift >> approach;
    static void bit2(int n ,int k){
        int b = (n>>(k-1)&1);
        if(b==1){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}
