package Bitwise;
public class PowerSubSetUsingBitWiseOperator {
    public static void main(String[]args){
   String str = "abc";
   int n = str.length();
   subset(str,n);
    }
    static void subset(String str,int n){
        int power = (int) Math.pow(2,n);
        for(int count = 0; count < power; count++) {
            for (int j = 0; j < n; j++) {
                if (((count>>j) & 1) != 0) {
                    System.out.print(str.charAt(j)+" ");
                }
            }
            System.out.println("");
        }
    }
}
